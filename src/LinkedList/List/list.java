package LinkedList.List;

public class list {
    public static class Node {
        int data;    // value
        Node next;     // address
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(16);

        /*// 5 3 9 16
        a.next = b; // 5->3 9 16    // we put b address in a.next
        System.out.println(a);
        System.out.println(a.next); // b address
        System.out.println(b);*/


        /*a.next = b;
        System.out.println(a.next.data); // it print value of b
        System.out.println(b.data);*/

        // to connect every linkedlist
        a.next = b;
        b.next = c;
        c.next = d;

        // 5->3->9->8->16
        // we can implement linkedlist using single element means head

        System.out.print(a.data + " "); // a data
        System.out.print(a.next.data + " ");    // b data
        System.out.print(a.next.next.data + " ");   // c data
        System.out.print(a.next.next.next.data + " "); // d data
    }
}
