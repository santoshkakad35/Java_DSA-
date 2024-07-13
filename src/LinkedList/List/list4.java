package LinkedList.List;
// using recursion
public class list4 {
    public static void display(Node head) {
        if(head == null) return;    // base
        System.out.print(head.data);        // self
        display(head.next);         // recursive work
    }

    public static class Node {
        int data;    // value
        Node next;     // address
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);   // head
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);

    }
}
