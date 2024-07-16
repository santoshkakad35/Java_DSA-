package stacks.theoryQue;

import java.util.Stack;
// stack using function
public class basic8 {
    public static void display(Stack<Integer> st) {
        st.push(100);
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        display(st);
    }
}
