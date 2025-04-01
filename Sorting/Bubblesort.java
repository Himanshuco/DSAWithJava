package Himanshu.DSAWithJava.Sorting;

public class Bubblesort {
    public static void bubbleSort(int arr[]){
        int size = arr.length;
        int swap=0;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            if(swap==0){
                return ;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,2,3};

        System.out.println("Array before Sorting");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Array after Sorting");
        printArray(arr);
    }
    
}
