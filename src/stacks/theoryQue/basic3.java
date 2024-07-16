package stacks.theoryQue;
import java.util.*;
public class basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // input the stack element
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);
    }
}
