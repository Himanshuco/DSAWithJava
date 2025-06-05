import java.lang.*;
import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        String str = "Helo i am a string";
        String str2= "Helo string 2";

        //Method 1 : char charAt(int index) - Returns the character at the specific index.
        int n =5;
        System.out.println("Character at index "+n+" is "+str.charAt(n));

        //Method 2 : int capacity() - Returns the maximum capacity that can be entered in the current string.
        
        //Method 3 : int compareTO(str , str2);
        int cmp = str.compareTo(str2);
        System.out.println("Comparing strings ; "+cmp);

        // Method 4 : int length() - Return the length of the string.
        System.out.println("The length of the string is "+str.length());

        //Method 5 : String concat(String str) - Concatenate the string to the end of another string.
        System.out.println("Concatenation : "+str.concat(str2));

        //Method 6 : indexof() - Tells the index of a particular character.
        System.out.println("Occurence of a "+str.indexOf('a'));
        System.out.println("Last Occurence of a "+str.lastIndexOf('a'));

        //Method 7 : substring(str) - Returns the substring.
        System.out.println("Substring from index 4 onwards = "+str.substring(4));

        //Method 8 : replace('old', 'new') : - Replace a character with new char.
        str  = str.replace('s','&');
        System.out.println("S replaced with & : "+str);

        //Method 9 : Case conversions 
        //1: toLowercase()
        System.out.println("Converted to lower case : "+str.toLowerCase());
        //2: toUppercase()
        System.out.println("Converted to lower case : "+str.toUpperCase());

        //Method 10 : toString()
        int arr[]={1,2,3,4,5};
        String arrStr  = Arrays.toString(arr);
        System.out.println(arrStr);

        //Method 11 : split()
        String words[] = str.split(" ");
        System.out.println("Total number of words : "+words.length);
        for (String s : str.split(" ")) {
            System.out.println(s);
            
        }

    }
    
}
