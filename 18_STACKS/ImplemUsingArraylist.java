import java.util.ArrayList;
public class ImplemUsingArraylist{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //Push
        public static void push(int val){
            list.add(val);
        }
        //Pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}