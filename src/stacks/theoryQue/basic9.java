package stacks.theoryQue;

import java.util.Scanner;
import java.util.Stack;

// display recursively
public class basic9 {
    public static void insertAtBottom(Stack<Integer> st, int ele) {
        if(st.isEmpty()) {
            st.push(ele);
            return;
        }

        int newEle = st.pop();
        insertAtBottom(st, ele);
        st.push(newEle);
    }
    public static void reverse(Stack<Integer> st) {
        //LOF
        if(st.size() == 1) return;
        int ele = st.pop();
        reverse(st);
        insertAtBottom(st, ele);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        reverse(st);

        System.out.println(st);
    }
}
