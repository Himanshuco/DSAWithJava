package Himanshu.DSAWithJava.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearsrc(int arr[] , int target){
        int found = 0;
        for(int i= 0 ; i<arr.length;i++){
            //Condition
            if(arr[i]==target){
                found=i;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        //Input
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<=size-1;i++){
            arr[i]=sc.nextInt();
        }
        int target;
        System.out.println("Enter the target element to search:- ");
        target = sc.nextInt();

        int found = linearsrc(arr,target);
        if(found!=0){
            System.out.println("Element found at index= "+found);
        }else{
            System.out.println("Element not found :-(");
        }
    }
}
