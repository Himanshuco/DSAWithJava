import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }
    }
    
}


//Approach 2 :
// boolean x = (year%4)==0;
// boolean y = (year%100)==0;
// boolean z = ((year %100)==0 && (year%400)==0);
// if(x && (y || z)){
//     System.out.println("Leap year");
// }else{
//     System.out.println("Not a leap year");
// }