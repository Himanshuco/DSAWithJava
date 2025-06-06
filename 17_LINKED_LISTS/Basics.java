public class Basics{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    //Operation 
    //1)Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //2)Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode = head = tail ;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //3)Print a LinkedList
    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    
    //4)Add middle in LL
    public void addMiddle(int data , int index){
        if(index ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //5)Size of LL
    public int size(){
        Node temp = head;
       int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        return count;
    }

    //6)Remove First
    public void removeFirst(){
        int count = size();
        if(count==0){
            System.out.println("LL is empty");
            return;
        }else if (count ==1){
            head = tail = null;
            return;
        }
        head = head.next;
    }

    //7)Remove Last
    public void removeLast(){
        int count = size();
        Node prev = head;
        for(int i=0;i<count-2;i++){
            prev = prev.next;
        }
        prev.next= null;
        tail = prev;
    }

    //8)Remove Nth node from end

    public static void main(String[] args) {
        Basics ll = new Basics();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL(); 
        
        System.out.println("Size= "+ll.size()); 
        System.out.println();
        ll.addMiddle(2, 2);
        ll.printLL();
        System.out.println("Size= "+ll.size()); 
        System.out.println();

        ll.removeFirst();
        ll.printLL();
        System.out.println("Size= "+ll.size()); 
        System.out.println();

        ll.removeLast();
        ll.printLL();
        System.out.println("Size= "+ll.size()); 
        System.out.println();
    }
}