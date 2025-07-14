import java.util.ArrayList;

class ArrayLeaders{
    static ArrayList<Integer> optimized(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();

        leaders.add(arr[arr.length-1]);
        int j=0;
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>leaders.get(j)){
                leaders.add(arr[i]);
                j++;
            }
        }
        java.util.Collections.reverse(leaders);
        return leaders;

    }
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            boolean isLeader = true;
            
            while (j < arr.length) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
                j++;
            }
            
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }
        
        leaders.add(arr[arr.length - 1]);
        
        return leaders;
    }

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = leaders(arr);
        ArrayList<Integer> oleaders = optimized(arr);
        System.out.println("Leaders in the array are: " + leaders);
        System.out.println("Leaders in the array are: " + oleaders);
    }
}
