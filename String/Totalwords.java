package Himanshu.DSAWithJava.String;

import java.util.Scanner;

public class Totalwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = sc.nextLine();
        // String word = "Helo i am JAVA";
        String words[] = word.split(" ");
        System.out.println("Total number of words are : "+ words.length);

    }
    
}
