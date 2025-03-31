package Himanshu.DSAWithJava.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of Array : ");
        size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter the elements of Array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Array after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the element to be Searched : ");
        int target;
        target = sc.nextInt();

        //Binary Search
        int low =0;
        int high =  arr.length;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index : "+mid);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("Element not found in the Array");
    }
    
}
