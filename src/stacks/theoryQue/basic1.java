package stacks.theoryQue;

import java.util.*;
/*Note : - we can't access the 89 directly

 */
public class basic1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  // syntax
        st.push(1);
        st.push(89);
        st.push(26);
        st.push(32);
        // peek
        System.out.println(st.peek());  // it print the top element of stack
        System.out.println(st);     //it print the stack

        st.pop();   // it removes top element
        System.out.println(st);

        System.out.println("Size of the stack : "+st.size());   // print the length of stack
    }
}
