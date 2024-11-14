package Test00;

public class main {
    // for linkedlist
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
            Node temp = new Node(100);
            if(head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if(idx == length()) {
                insertAtEnd(val);
                return;
            }
            for (int i = 1; i < idx-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }
        void deleteAt(int idx) {
            Node temp = head;
            for(int i=1;i<=idx-1;i++) {
                temp = temp.next;

            }
            temp.next = temp.next.next;
            tail = temp;
        }

        void displaying() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int length() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }
    }
    // for print
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // For Recursion
    public static void displayRec(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRec(head.next);
    }

    // for reverse recursion
    public static void displayRecRev(Node head) {
        if (head == null) return;
        displayRecRev(head.next);
        System.out.print(head.data + " ");
    }

    // to calculate size
    public static void size(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println(count);
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(12);
        ll.insertAtEnd(23);
        ll.insertAtEnd(83);
//        ll.displaying();
        System.out.println();
        ll.insertAtEnd(89);
        ll.insertAtEnd(9);
//        ll.displaying();
//        System.out.println();
//        ll.insertAtHead(100);
//        ll.insertAt(3, 300);
//        ll.insertAt(7, 500);
        ll.deleteAt(2);
        ll.displaying();
//        System.out.println(ll.tail.data);
//        System.out.println(ll.length());
//        a.next = b;
//        b.next = c;
//        c.next = d;

        // head -> a
        /*System.out.print(a.data +" "); // a
        System.out.print(a.next.data +" ");    //b
        System.out.print(a.next.next.data +" ");   //c
        System.out.print(a.next.next.next.data +" ");  //d*/

        /*Node temp = a;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }*/

//        display(a);
//        displayRec(a);
//        displayRecRev(a);
//        size(a);
    }


}
