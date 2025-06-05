import java.lang.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        // String str ="Hello I am Himanshu";
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        str = sc.nextLine();
        int word=0;
        if(str.isEmpty()){
            System.out.println("No words");
        }
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' ' && i+1 <str.length() && Character.isLetter(str.charAt(i+1))){
                word++;
            }
        }
        word++;
        System.out.println("Total words = "+word);
    }
    
}
