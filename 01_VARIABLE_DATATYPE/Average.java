import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a =sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b =sc.nextInt();
        System.out.print("Enter the Third number: ");
        int c =sc.nextInt();
        float averagef =(float) (a+b+c)/3;
        int averagei = (a+b+c)/3;
        System.out.println("Average is(Float) : "+averagef);
        System.out.println("Average is(Integer) : "+averagei);
        }
    
}
