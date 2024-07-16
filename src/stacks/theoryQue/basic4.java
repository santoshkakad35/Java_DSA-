package stacks.theoryQue;

import java.util.*;
// copy contents of one stack to another in same order
public class basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(89);
        st.push(45);
        st.push(90);
        System.out.println(st);


        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            /*int x = st.peek();
            rt.push(x);
            st.pop();*/

            rt.push(st.pop()); /* this lines means st.pop peek upper
                                  element and then rt.push pushes the given
                                  element and after pop function execute */
        }

        System.out.println(rt);

        Stack<Integer> gt = new Stack<>();
        while (rt.size()>0) {
            gt.push(rt.pop());
        }

        System.out.println(gt);
        System.out.println(st); // you notice now st is empty

        while (gt.size()>0) {   // we get st in reverse order also
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
