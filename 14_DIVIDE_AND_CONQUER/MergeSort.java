public class MergeSort{
    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si ; int j = mid+1 ;  int k = 0;  //Pointers
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0 , i=si ;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }

    }
    public static void mergeSort(int arr[] , int si , int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si , mid , ei);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        
        System.out.println("Array before sorting : ");
        printArr(arr);
        mergeSort(arr , 0 , arr.length-1);
        System.out.println();
        System.out.println("Array after sorting : ");
        printArr(arr);
    }
    
}
