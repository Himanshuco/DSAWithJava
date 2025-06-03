public class MaxSumSubarray {
    public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    //Kadan's Algorithm
    for(int i=0;i<arr.length;i++){
        currSum = arr[i]+currSum;
        if(currSum<0){
            currSum=0;
        }
        maxSum = Math.max(currSum , maxSum);

    }
    System.out.println("Max sum of the subarray is : "+maxSum);
   }
    
}
