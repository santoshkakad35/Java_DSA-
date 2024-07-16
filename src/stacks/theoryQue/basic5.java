package stacks.theoryQue;
import java.util.*;
// insert at any index
public class basic5 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int idx = 2;
        int x = 90;
        Stack<Integer> gt = new Stack<>();
        while(st.size()>idx) {
            gt.push(st.pop());
        }
        st.push(x);

        while (gt.size()>0) {
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
