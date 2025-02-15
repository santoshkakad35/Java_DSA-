package LinkedList.DoublyLinkedList;

public class InsertionAtAnyIndx {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    public static void insertAt(Node head, int idx) {
        Node  temp = head;
        for (int i = 1; i <= idx-1 ; i++) {
            temp = temp.next;
        }

        /*100 19 32 89 21*/
        Node t  = new Node(50);
        temp.next.prev = t; /* t <-- 89*/
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;

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

        System.out.println("Original Linked List");
        display(a);
        insertAt(a, 3);
        System.out.println();
        System.out.println("Modified Linked List");;
        display(a);
    }

    public static void display(Node a) {
        Node temp = a;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
}
