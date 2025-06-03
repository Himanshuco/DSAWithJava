public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={5,8,7,10,15,20,25}; 
        int target = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    
}
