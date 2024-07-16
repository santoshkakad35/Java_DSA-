package stacks.theoryQue;

import java.util.Stack;

public class basic7 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // this is for stack->Array
        int n = st.size();
        int[] arr = new int[n];
        for (int i = n-1; i >=0 ; i--) {
            arr[i] = st.pop();
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        // this is for Array->stack
        for(int i=0;i<n;i++) {
            st.push(arr[i]);
        }

        System.out.println(st);
    }
}
