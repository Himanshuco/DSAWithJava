import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(9);
        pq.add(29);
        pq.remove(9);
        pq.add(4);
        System.out.println("Priority queue-1");
        //Less value <=> More priority
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        //More vallue <=> More priority
        PriorityQueue<Integer> pqh = new PriorityQueue<>(Comparator.reverseOrder());
        pqh.add(1);
        pqh.add(2);
        pqh.add(9);
        pqh.add(29);
        pqh.add(4);
        System.out.println();
        System.out.println("Priority queue-2");
        //Less value <=> More priority
        while(!pqh.isEmpty()){
            System.out.println(pqh.peek());
            pqh.remove();
        }

        
        
    }
}
// A priority queue is a special type of queue in which each element us associated with a priority, 
//and element are served based on their priority rather then just the insertion order.

