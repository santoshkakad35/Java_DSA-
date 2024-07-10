package LinkedList.List;

        /*  Single linked list
        1.  get -> O(n)
        2.  if only , the head is given for making you must traversed the whole
        3.  it take extra space
        4.  we cannot move backwards
         */

public class doubleLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    public static void insertAtIdx(Node head, int idx, int x ) {
        Node s = head;
        for(int i=1;i<=idx-1;i++) {
            s = s.next;

        }
        Node r  = s.next;
        Node t = new Node(x);

        s.next = t;

        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
            System.out.println();
    }

    public static void displayRev(Node tail) {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
            System.out.println();
    }

    public static void Random(Node random) {
        Node temp = random;

        while(temp.prev != null) {
            temp = temp.prev;
        }

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertionAtHead(Node head, int x) {
        Node t = new Node(100);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertionAtTail(Node head, int x) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;

    }
    public static void main(String[] args) {
        Node a = new Node(19);
        Node b = new Node(76);
        Node c = new Node(35);
        Node d = new Node(89);
        Node e = new Node(18);

        a.next = b; // a -> b
        b.prev = a; //  b -> a

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = null;
//        display(a);
//        displayRev(e);
//        Random(c);
        insertAtIdx(a,3, 93);
        display(a);
    }
}
