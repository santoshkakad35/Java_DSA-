package stacks.theoryQue;

import java.util.Stack;

public class basic6 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
//        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }

        while(rt.size()>0) {
            int x  = rt.pop();
            System.out.println(x + " ");
            st.push(x);

        }

        System.out.println(st);
    }
}
