import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a; int b; int c;
        System.out.print("Enter the value of a: ");
        a= sc.nextInt();
        System.out.print("Enter the value of b: ");
        b= sc.nextInt();  
        System.out.print("Enter the value of c: ");
        c= sc.nextInt();   
        if(a>b && a>c){
             System.out.println("A is greatest "+a);
        }else if(b>c){
            System.out.println("B is greates "+b);
        }else{
            System.out.println("C is greatest "+c);
        }
    }
    
    
}
