package LinkedList;

public class InsertElementAtBeginning {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail= temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size() {
            int count = 0;
            Node temp = head;
            while(temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(31);
        ll.insertAtHead(21);
        ll.insertAtHead(43);
        ll.display();
        System.out.println("Linked list size : "+ll.size());
    }
}
