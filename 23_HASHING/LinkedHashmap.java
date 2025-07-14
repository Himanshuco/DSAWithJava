import java.util.LinkedHashMap;

public class LinkedHashmap {
    
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        //Insertion order is maintained of the keys
        
        lhm.put("India",  100);
        lhm.put("China", 150);
        lhm.put("Us",50);

        System.out.println(lhm);
    }
}
