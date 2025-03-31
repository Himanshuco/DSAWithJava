package Himanshu.DSAWithJava.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={8,5,4,3,2,1,9}; 
        for(int i=0;i<=(arr.length-1)/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp; 

        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }
    
}
