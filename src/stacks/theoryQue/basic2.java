package stacks.theoryQue;

import java.util.Stack;

public class basic2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  // syntax
        st.push(1);
        st.push(89);
        st.push(26);
        st.push(32);

        // if we want to access the first element means 1 using loop

        while(st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);     /* here it print only one means in the loop the pop() function
         permanently delete the element  it is a disadvantage*/
    }
}
