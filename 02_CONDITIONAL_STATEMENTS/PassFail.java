import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks;
    System.out.print("Enter Your marks:  ");
    marks= sc.nextInt();
    // if(marks>=33){
    //     System.out.println("Pass");
    // }else{
    //     System.out.println("Fail");
    // }
    String status = marks>=33 ? "Pass": "Fail";  
    System.out.println(status);
    }   
}
