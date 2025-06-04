import java.util.*;
public class Basics {
    public static void main(String[] args) {
        //Create 
        HashMap <String, Integer> hm  = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China" , 150);
        hm.put("US" , 50 );

        System.out.println(hm);

        //Get
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Canda"));  //Null

        //Contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Canada"));

        //Remove
        hm.remove("china");
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Clear
        hm.clear();
        System.out.println(hm);

        //Iterate on HashMap
        hm.put("India", 100);
        hm.put("China" , 150);
        hm.put("US" , 50 );
        hm.put("Nepal" , 5);

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        
        for (String k : keys) {
            System.out.println("Key = "+k+" "+" Value = "+ hm.get(k));   
        }
    }
    
}
