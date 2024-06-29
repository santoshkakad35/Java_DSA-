package LinkedList.List;
// singly linkedlist
public class list2 {
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

        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
//        System.out.println(temp.data);
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
