package Himanshu.DSAWithJava.Arrays;
import java.util.*;

public class Array{
    public static void main(String[] args) {
        int size = 5;
        //Declaration
        int arr[];
        //Memory allocation
        arr= new int[size];
        //Input
        //Case 1:-
        arr[0]=4;
        System.out.println("The value at index 0 is: "+arr[0]);
        //Case 2:-
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        arr[1]=sc.nextInt();
        System.out.println("The value at index 1 is: "+arr[1]);
        //Length
        int len = arr.length;
        System.out.println("The length is : "+len);
        //Default values 
        System.out.println("The value at index 2 is: "+arr[2]);
        //Looping
        System.out.println("Enter the elements of the array");
        for(int index=0;index<=len-1;index++){
            System.out.print(index+"=");
            arr[index]=sc.nextInt();
        }
        //Print the Arrya
        for(int i=0;i<len;i++){
            System.out.print("The value at index "+i+" = ");
            System.out.println(arr[i]);

        }
    }
    
} 

