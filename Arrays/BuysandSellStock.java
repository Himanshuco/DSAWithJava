package Himanshu.DSAWithJava.Arrays;

public class BuysandSellStock{
        public static void main(String[] args) {
            int arr[]= {7,1,5,3,6,4};
            int buy=Integer.MAX_VALUE;
            int sell=Integer.MIN_VALUE;
            int index=0;
            int profit;
    
            for(int i=0;i<arr.length;i++){
                if(arr[i]<buy){
                    buy=arr[i];
                    index=i;
                    
                }
            }
            for(int j=index+1;j<arr.length;j++){
                if(arr[j]>sell){
                    sell=arr[j];
                }
            }
            profit=sell-buy;
            System.out.println("Profit ="+profit);
        }
        
    }
