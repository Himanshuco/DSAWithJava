public class Quicksort{
    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i =  si-1;
        for(int j=0;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp  = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp  =pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void quicksort(int arr[], int si , int ei){
        if(si<ei){
            int pi = partition(arr , si ,ei);
            quicksort(arr , si , pi -1);
            quicksort(arr , pi+1 , ei);
        }
    }
        public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};

        System.out.println("Array before sorting : ");
        printArr(arr);
        quicksort(arr , 0 , arr.length);
        System.out.println();
        System.out.println("Array after sorting : ");
        printArr(arr);
    }
    
}

