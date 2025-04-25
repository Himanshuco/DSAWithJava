import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        //variable = a
        int a =sc.nextInt();
        System.out.print("Enter the Second number: ");
        //variable = b
        int b =sc.nextInt();
        System.out.println("Addition : "+(a+b));
        System.out.println("Substraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Remainder : "+(a%b));
    }
    
}
