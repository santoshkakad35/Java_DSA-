package LinkedList;

public class InsertAtandGetAt {
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

        void insertAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);  // Create a new node
            Node temp = head;        // Start from the head node

            if (idx == size()) {     // Insert at the end if idx equals size
                insertAtEnd(val);
                return;
            } else if (idx == 0) {   // Insert at the beginning if idx is 0
                insertAtStart(val);
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {  // Traverse to the node before idx
                temp = temp.next;
            }

            // Perform the insertion
            t.next = temp.next;
            temp.next = t;

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        int getAt(int idx) {
            Node temp = head;
            for(int i=1;i<=idx-1;i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            Node temp = head;
            for(int i=1;i<=idx-1;i++) {
                temp = temp.next;
            }
            /*if we delete first element*/
            if(idx == 0) {
                head = head.next;
            }
            /*if we delete last element*/
            if(idx == size()-1) {
                temp.next = temp.next.next;
                tail = temp;
            } else {

                temp.next = temp.next.next;
            }
        }
    }


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(22);
        ll.insertAtEnd(29);
        ll.insertAtEnd(52);
        ll.insertAtEnd(54);
        ll.insertAtEnd(32);
        ll.insertAtStart(78);
        ll.insertAtStart(82);
        ll.insertAt(3,89);
        ll.insertAt(0,100);
        ll.insertAt(0,900);
        ll.insertAt(10,90);
//        System.out.println(ll.size());;
        ll.insertAt(11,762);
        ll.display();
//        System.out.println(ll.getAt(2));
        ll.deleteAt(0);
        ll.display();
    }
}
