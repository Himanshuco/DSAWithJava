public class Bubblesort {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void bubblesort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swap(arr[j],arr[j+1]);
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,2,3};
        System.out.print("Array before sorting : ");
        printArr(arr);

        bubblesort(arr);
        System.out.println();
        System.out.print("Array after sorting : ");
        printArr(arr);
        
    }   
}
