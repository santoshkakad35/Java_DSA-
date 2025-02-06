package LinkedList;
// print linked list recursively
public class DisplayLinkedListRecursively {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
//  display it recursively
    public static void display(Node head) {
        if(head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(21);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
    }
}
