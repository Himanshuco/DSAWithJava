package Himanshu.DSAWithJava.Arrays;

//Brute force Approach
public class MaximumSum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int maxsum=Integer.MIN_VALUE;
        int csum=0;
         for(int i=0;i<=arr.length-1;i++){
            int start = i;
            //System.out.println("start="+start);
            for(int j=i;j<=arr.length-1;j++){
                int end = j;
                //System.out.println("end="+end);
                csum=0;
                for(int k=start;k<=end;k++){
                    csum+=arr[k];
                    //System.out.print(csum); 
                }
                if(maxsum<csum){
                    maxsum=csum;
                }
                //System.out.println();
            }
            
        }
        System.out.println("max sum="+maxsum);
    }
    
}
