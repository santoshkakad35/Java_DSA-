package LinkedList;

import org.w3c.dom.Node;

public class DisplayLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(21);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
    }
}
