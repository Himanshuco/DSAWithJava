import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a= sc.nextInt();
        
        if(a%2==0){
            System.out.println(a+" Even number");
        }else{
            System.out.println(a+" Odd number");
        }
    }
    
}
