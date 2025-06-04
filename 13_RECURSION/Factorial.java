public class Factorial {
    public static int Factorial(int n){
        if(n==0 || n==1){
            return n ;

        }
        int fact = n*Factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n =4;
        int factorial  = Factorial(n);
        System.out.println("Factorial of "+n+" is "+ factorial);
        
    }
    
}
