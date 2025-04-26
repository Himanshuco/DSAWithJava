import java.util.Scanner;

public class DrinkSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1 or 2 or 3");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Mango shake");
                break;
            case 2:
                System.out.println("Bannana Shake");
                break;
            case 3:
                System.out.println("Sugarcane shake");
                break;
            default:
                System.out.println("No more drinks ! Invalid choice");
                break;
        }
    }
    
}
