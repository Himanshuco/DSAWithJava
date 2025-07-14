// Moore Voting Algorithm
// The intuition behind the Moore's Voting Algorithm is based on the fact that if there is a majority element in an array, 
// it will always remain in the lead, even after encountering other elements.

public class Majorityelement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};
        int majorityel = majorityElement(nums);
        System.out.println("Majority element : "+majorityel);
    }
}
