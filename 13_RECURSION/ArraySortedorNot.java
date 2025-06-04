public class ArraySortedorNot {
    public static boolean isSorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }else if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        boolean check = isSorted(arr, 0);
        if(check == true){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is unsorted");    
        }
    }
    
}
