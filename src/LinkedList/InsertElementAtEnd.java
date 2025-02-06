package LinkedList;

public class InsertElementAtEnd {
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
//            for empty linked list
            if(head == null) {
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }

//        display the linked list
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count= 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(33);
        ll.insertAtEnd(29);
        ll.insertAtEnd(21);
        ll.insertAtEnd(87);
        ll.display();   /* 33 29 21 87 */
        System.out.println();
        ll.insertAtEnd(74);
        ll.display();    /* 33 29 21 87 74 */
        System.out.println();
        System.out.print("The length of linked list : "+ll.size());
    }
}
