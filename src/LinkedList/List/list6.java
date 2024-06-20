package LinkedList.List;

public class list6 {
    public static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static class Node{
        int data;
        Node next;
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

        System.out.println(length(a));

    }
}
