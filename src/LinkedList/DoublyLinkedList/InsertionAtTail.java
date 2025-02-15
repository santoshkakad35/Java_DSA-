package LinkedList.DoublyLinkedList;

public class InsertionAtTail {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    public static void insertAtTail(Node head) {
        Node t = new Node(30);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = t;
        t.prev = temp;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(19);
        Node c = new Node(32);
        Node d = new Node(89);
        Node e = new Node(21);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        insertAtTail(a);
        display(a);
    }

    public static void display(Node newHead) {
        Node temp = newHead;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }
}
