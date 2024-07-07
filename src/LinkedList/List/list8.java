package LinkedList.List;
// insert at head
public class list8 {
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

        void insert(int val) {
            Node temp = new Node(val);
            if(head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }

        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
//            int c =0 ;
            while (temp != null) {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(12);
        l.insertAtEnd(13);
//        l.display();
        l.insert(4);
        l.insert(5);
        l.display();
    }
}
