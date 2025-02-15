package LinkedList.DoublyLinkedList;

public class displayRandom {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    public static void displayHead(Node random) {
        Node temp = random;
        while(temp.prev != null) {
            temp = temp.prev;
        }
        System.out.print(temp.val+" ");
    }


    public static void main(String[] args) {
        Node a = new Node(30);
        Node b = new Node(55);
        Node c = new Node(25);
        Node d = new Node(15);
        Node e = new Node(65);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;


        displayHead(c);
    }
}
