import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The area of square is : "+area);
        
    }
    
}
