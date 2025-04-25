import java.util.*;

public class BillCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Price of First item: ");
        int item1 =sc.nextInt();
        System.out.print("Enter the Price of Second item: ");
        int item2 =sc.nextInt();
        System.out.print("Enter the Price of Third item: ");
        int item3 =sc.nextInt();
        int TOTAL = item1+item2+item3;
        System.out.println("Total price without G.S.T "+TOTAL);
        System.out.println("Total price without G.S.T(18%) : "+TOTAL*0.18f);
        System.out.println("Thanks for Shopping");
    }
    
}
