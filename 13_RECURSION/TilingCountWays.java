public class TilingCountWays {
    public static int tilling(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fm1 = tilling(n-1);
        int fm2= tilling(n-2);
        int total  = fm1+fm2;
        return total;
    }
    public static void main(String[] args) {
        int n  = 5;
        System.out.println("The board size is 2 X "+n);
        int countways = tilling(n);
        System.out.println("Number of ways to tile with 2 X "+n+" board is : "+ countways);

    }   
}
