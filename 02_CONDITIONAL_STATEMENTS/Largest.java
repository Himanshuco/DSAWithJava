import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a= sc.nextInt();
        System.out.print("Enter value of b: ");
        b=sc.nextInt();

        
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(a==b){
            System.out.println(a+" is equal to "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
    
}
