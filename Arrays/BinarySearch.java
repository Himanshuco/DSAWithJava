package Himanshu.DSAWithJava.Arrays;

import java.util.Arrays; 
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        
       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        Arrays.sort(arr);
        System.out.println("Array after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int target;
        System.out.println("Enter the target element to search: ");
        target = sc.nextInt();
        
       
        int low = 0;
        int high = arr.length - 1; 

        while (low <= high) { 
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;  
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        System.out.println("Element not found in the Array");
        
    }
    
}
