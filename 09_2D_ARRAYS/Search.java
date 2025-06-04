public class Search {
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target = 37;
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                System.out.println("Element found at index "+row+" "+col);
                return ; 
            }else if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Element not found");
    }
    
}
