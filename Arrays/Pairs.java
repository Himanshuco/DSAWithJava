package Himanshu.DSAWithJava.Arrays;

public class Pairs {
    public static void main(String[] args) {
        int arr[]={5,4,7,2,1,3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+arr[i]+" "+arr[j]+")");
            }
            System.out.println();
    
        }
    } 
}
