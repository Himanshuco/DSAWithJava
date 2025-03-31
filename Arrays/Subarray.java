package Himanshu.DSAWithJava.Arrays;

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        //Input
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<=size-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            int start = i;
            //System.out.println("start="+start);
            for(int j=i;j<=arr.length-1;j++){
                int end = j;
                //System.out.println("end="+end);
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
}
}
