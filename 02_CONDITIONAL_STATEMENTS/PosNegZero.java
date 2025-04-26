import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter number: ");
        double num1 = sc.nextInt();
        if(num1==0){
            System.out.println("Number is zero");
        }else{
            if(num1>0){
                System.out.println("Positive number");
            }else{
                System.out.println("Negative number");
            }
        }
        sc.close(); 
    }
}
