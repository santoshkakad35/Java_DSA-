package LinkedList;

public class LengthOfLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static int length(Node a) {
        int count = 0;
        while(a!=null) {
            count++;
            a = a.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(22);
        Node c = new Node(29);
        Node d = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(length(a));;
    }
}
