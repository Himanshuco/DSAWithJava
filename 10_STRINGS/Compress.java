import java.util.*;
public class Compress {
    public static String compress(String str) {
        String newStr = new String("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;  
    }
    public static void main(String[] args) {
        String str = "aaabbcccdde";
        String str2 = compress(str);
        System.out.println("Compressed String : "+str2);
        
    }
    
}
