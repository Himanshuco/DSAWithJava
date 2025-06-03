public class SubArray {
     public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        for(int i=0;i<arr.length;i++){ //Starting point of the subarray
            for(int j=i ; j<arr.length;j++){ //Ending point of the subarray
                System.out.print("(");
                for(int k=i;k<=j;k++){ //Range of the subarray(i to j)
                    System.out.print(arr[k]+","+" ");
                }
                System.out.print(")");
                System.out.println();
            }
        }

    }
    
}
