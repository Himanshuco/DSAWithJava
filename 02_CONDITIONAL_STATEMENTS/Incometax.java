import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income ");
        income= sc.nextInt();
        if(income<500000){
            System.out.println("No tax");
        }else if(income >500000 && income < 1000000){
            System.out.println("20% tax");
            System.out.println("Tax = "+income*0.2);
        }else{
            System.out.println("30% tax");
            System.out.println("Tax = "+income*0.3);
        }
    }    
}
