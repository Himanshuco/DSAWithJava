public class BinarySearch {
    public static void main(String[] args){
        int arr[]={5,8,7,10,15,20,25}; //Array should be sorted.
        int target = 10;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index "+mid);
                return;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("Element not found");
    }
    
}
