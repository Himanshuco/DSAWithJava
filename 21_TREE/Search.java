class Node {
    int data;
    Node next;

    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Search {
    Node head;

    public Search() {
        head = null;
    }

    public int itrsearch(int key){
        Node temp = head;
        int index=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Element found at index : "+index++);
                return 1;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Search  list = new Search();
        Node first = new Node(10);
        list.head = first;
        Node second = new Node(30);
        first.next = second;
        Node third = new Node(20);
        second.next = third;
        Node fourth = new Node(90);
        third.next = fourth;
        list.itrsearch(20);


    }
}
