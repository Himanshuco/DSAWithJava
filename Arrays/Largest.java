package Himanshu.DSAWithJava.Arrays;

public class Largest {
    public static void main(String[] args) {
        int arr[]={3,4,8,10,2,1};
        int len = arr.length;
        int largest = arr[0];
        int smallest = arr[0];
        int i=1;
        while(i<len){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            i++;
        }
        System.out.println("Largest value = "+largest);
        System.out.println("Smallest value = "+smallest);
    }
    
}
