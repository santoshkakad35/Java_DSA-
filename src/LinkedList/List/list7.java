package LinkedList.List;


import java.util.Scanner;

// insert element
public class list7 {
    public static class Node {
        int data;
        Node next;

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

        void display(){
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while(temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        linkedlist l = new linkedlist();
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.display();
        System.out.println("The size of linked list " + l.size());
    }
}
