package DSA.DSAWithJava.00_BRUTE_FORCE;

public class MaxMin { 
    //Brute Force
    public static void MaxMinB1(int arr[], int max , int min ){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum value ="+max); 
        System.out.println("Minimum value ="+min);

}
    //Optimized 
    public static void MaxMinB2(int arr[], int max , int min){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else{
                if(arr[i]<min){
                    min = arr[i];
                }
            }  
        }
        System.out.println("Maximum value ="+max); 
        System.out.println("Minimum value ="+min);
    }

    public static void main(String[] args) {
        int arr[] = {8,16,0,-5,18,2,9,60,30,25};
        int arr2[]={5,9,8,10,12,16,-10,6};
        int max = arr[0];
        int min=arr[0];
        MaxMinB1(arr, max, min);
        MaxMinB2(arr2, max, min);

        
    }

    
}
