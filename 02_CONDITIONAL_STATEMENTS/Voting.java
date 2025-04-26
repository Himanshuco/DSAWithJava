import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        if(age>=18){
            System.out.println("You are adult and can vote");
        }if(age>=13 && age <=18){
            System.out.println("Teenager");
        }else{
            System.out.println("Not adult can't vote");
        }
    }
}

