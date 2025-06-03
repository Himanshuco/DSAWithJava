public class BuySellStock {
    public static int buySellStock(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(buyprice<arr[i]){
                int profit = arr[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyprice=arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,2,3,1,8,9};
        int maxProfit = buySellStock(arr);
        System.out.println("Maximum Profit that can be obtained is  : "+maxProfit);

    }
    
}
