package LinkedList;
// Leetcode237
public class DeleteNodeInLL {
    public static class Node  {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    static void deleteNodeLeetcode237(Node target) {
        Node temp = target;
        temp.val = temp.next.val;
        temp.next = temp.next.next;
    }

    static void print(Node a) {
        Node temp = a;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new  Node(10);
        Node b = new  Node(8);
        Node c = new  Node(5);
        Node d = new  Node(40);
        Node e = new  Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        deleteNodeLeetcode237(c);
        print(a);
    }
}
