import java.util.*;

public class Anagram {
    public static boolean anagram(String str , String str2){
        HashMap<Character , Integer> map = new HashMap<>();

        if(str.length()!= str2.length()){
            return false;
        }

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i) , 0)+1);
        }
        // System.out.println(map);

        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
}

    public static void main(String[] args) {
        String str  = "knee";
        String str2 = "keen";
        boolean ans = anagram(str, str2);
        System.out.println(str+" "+str2+" is anagram = "+ans);
    } 
    
}
