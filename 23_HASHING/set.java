import java.util.*;

public class set {
    public static void main(String[] args) {

        //1)HashSet - no duplicates , unordered , null is allowed
        System.out.println("HashSet");
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(2);
        

        System.out.println(hs);

        if(hs.contains(2)){
            System.out.println("Value is present");
        }else{
            System.out.println("Value is not present");
        }

        hs.remove(3);

        System.out.println(hs);
        System.out.println("Set size "+hs.size());
        // hs.clear();
        // System.out.println("Set ?? "+hs);
        // System.out.println("Is set empty "+hs.isEmpty());

        //Iteration 
        //A) using iterator
        System.out.println("Value in set :");
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //b) Enhanced for loop
        // for(Integer val : hs){
        //     System.out.println(val);
        // }


        System.out.println();
        //2)LinkedHashSet - Ordered using DDL
        System.out.println("LinkedHashSet");

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(3);
        lhs.add(2);
        

        System.out.println(lhs);

        if(lhs.contains(2)){
            System.out.println("Value is present");
        }else{
            System.out.println("Value is not present");
        }

        lhs.remove(3);

        System.out.println(lhs);
        System.out.println("Set size "+lhs.size());

        System.out.println();
        //2)LinkedHashSet - Sorted in ascedning order , Null values are Not allowed
        System.out.println("TreeSet");

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(3);
        ts.add(2);
        

        System.out.println(ts);

        if(ts.contains(2)){
            System.out.println("Value is present");
        }else{
            System.out.println("Value is not present");
        }

        ts.remove(3);

        System.out.println(ts);
        System.out.println("Set size "+ts.size());

    }
    
}
