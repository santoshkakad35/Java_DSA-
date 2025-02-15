package LinkedList;

public class NthNodeFromEnd {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    static Node nthNodefromEnd(Node head, int idx) {
        Node slow = head;
        Node fast = head;

        /*first we traversed the fast pointer upto idx*/
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }

        /*now traversed the slow and fast pointer one step*/
        while(fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(20);
        Node b = new Node(19);
        Node c = new Node(82);
        Node d = new Node(91);
        Node e = new Node(100);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node x = nthNodefromEnd(a,2);
        System.out.println(x.val);
    }
}
