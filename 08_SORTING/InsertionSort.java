public class InsertionSort {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void insertionsort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
           while(prev>=0 && arr[prev]>curr){
            arr[prev+1]= arr[prev];
            prev--;
           }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,2,8,9,100,6};
        System.out.print("Array before sorting : ");
        printArr(arr);

        insertionsort(arr);
        System.out.println();
        System.out.print("Array after sorting : ");
        printArr(arr);
        
    }   
}
