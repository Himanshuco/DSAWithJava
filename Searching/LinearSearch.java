package Himanshu.DSAWithJava.Searching;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the siuze of Array : ");
        size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter the elements of Array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Linear Search:
        System.out.print("Enter the element to be Searched : ");
        int target;
        target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index : "+ i );
                return;
            }
        }

    }
}