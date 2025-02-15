package LinkedList;

// Delete the nth node from the end
public class DeleteNthNodeFromEnd {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static void deleteNthNode(Node a, int val) {
        int size = 0;
        Node temp = a;

        // Calculate the size of the list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Edge case: If deleting the head
        if (val == size) {
            System.out.println("Cannot delete the head directly in this design.");
            return;
        }

        // Traverse to the node before the target node
        temp = a;
        int idx = size - val+1;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        // Delete the target node
        temp.val = temp.next.val;
        temp.next = temp.next.next;
    }

    static void print(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create and link nodes
        Node a = new Node(28);
        Node b = new Node(3);
        Node c = new Node(61);
        Node d = new Node(20);
        Node e = new Node(7);

        // Connect nodes to form the list: 28 -> 3 -> 61 -> 20 -> 7
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List:");
        print(a);

        // Delete the 3rd node from the end
        deleteNthNode(a, 3);

        System.out.println("List after deleting 3rd node from the end:");
        print(a);
    }
}
