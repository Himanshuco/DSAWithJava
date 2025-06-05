import java.util.Scanner;
import java.lang.String; //String class imported
import java.lang.StringBuffer; //StringBuffer class imported
import java.lang.StringBuilder; //StringBuilder class imported

public class Basics {
    public static void main(String[] args) {
        //String
        String str = "Helo this is a string"; //Method 1
        System.out.println(str);
        String str2 = new String("Helo i am string 2"); //Method 2
        System.out.println(str2);
        String emptyStr = new String();// Mthod to create a empty string
        System.out.println(emptyStr);

        //String Buffer
        StringBuffer str3 = new StringBuffer(); //Empty String Buffer
        StringBuffer str4 = new StringBuffer("I am String Buffer"); 
        // int n = 15;
        // StringBuffer str5 = new StringBuffer(n);
        // str5.append("Helo this a stringBuilder with limit 15");
        System.out.println(str3);
        System.out.println(str4);
        // System.out.println(str5);
    }
    
}
