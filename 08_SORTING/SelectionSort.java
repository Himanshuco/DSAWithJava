public class SelectionSort {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void selectionsort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int smallestIdx = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[smallestIdx]){
                    smallestIdx=j;
                }
            }
            int temp = arr[smallestIdx];
            arr[smallestIdx]= arr[i];
            arr[i]= temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,2,3};
        System.out.print("Array before sorting : ");
        printArr(arr);

        selectionsort(arr);
        System.out.println();
        System.out.print("Array after sorting : ");
        printArr(arr);
        
    } 
    
}
