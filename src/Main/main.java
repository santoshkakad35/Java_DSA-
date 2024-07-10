package Main;

import java.util.*;

public class main {

    public static class Node {
        int data;   // value
        Node next;  // data

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }

        }

        void insertAt(int idx, int val) {
            Node t = new Node(val); // new element
            Node temp = head;
            for (int i = 1; i <= idx - 1 ; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        void deleteAt(int idx) {
            Node temp = head;
            for(int i=0;i<= idx-1;i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        int count = 0;
        void size() {
            Node temp = head;
            while(temp != null) {
                count++;
                temp = temp.next;
            }

            System.out.println("count "+count);
        }


    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(5);
        l.insertAtEnd(8);
        l.insertAtEnd(9);
        l.insertAtHead(13);
        l.display();
        System.out.println();
        l.insertAt(2, 10);
        l.deleteAt(2);
        l.display();
//        l.size();
    }


}
