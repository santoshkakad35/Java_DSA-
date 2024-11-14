package LinkedList.Que;

public class getAt {

    public static Node getAt(Node head, int idx) {
        Node temp = head;
        for(int i=1;i<=idx;i++) {
            temp = temp.next;
        }

        return temp;

    }
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(19);
        Node b = new Node(30);
        Node res = getAt(a,2);
        System.out.println(res);
    }
}
