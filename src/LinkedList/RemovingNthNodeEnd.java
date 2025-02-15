package LinkedList;

public class RemovingNthNodeEnd {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static Node removeNthNode(Node head, int idx) {
        // Edge case: if head is to be deleted
//        if (head == null) return;
        Node fast = head;
        Node slow = head;

        // Move fast pointer 'idx' steps ahead
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        // Move both pointers until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node
        slow.next = slow.next.next;
        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(5);
        Node d = new Node(40);
        Node e = new Node(3);

        // Connect nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node x = removeNthNode(a, 5);
        print(x);
    }
}
