package stacks.theoryQue;

// LinkedList implementation of stacks
/*


 */
public class basic11 {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }


        int size() {
            return size;
        }

        int pop() {
            if(head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;

            return x;
        }

        int peek() {
            if(head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.val;
        }

        void displayrec(Node h) {
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display() {
            displayrec(head);
//            System.out.println();
        }
//        void displayRev() {
//            Node temp = head;
//            while(temp!=null) {
//                System.out.print(temp.val +" ");
//                temp= temp.next;
//            }
//            System.out.println();
//        }

        boolean isEmpty() {
            if (size ==0) {
                return true;
            } else {
                return false;
            }
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.display();
    }
}
