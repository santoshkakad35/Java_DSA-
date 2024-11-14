package Recursion;

import java.util.Scanner;

public class factorialNo {
    static int fact(int n) {
        if(n == 0) {
            return 1;
        }

        int res = fact(n-1);
        return n * res;
    }
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n  = sv.nextInt();
        System.out.println(fact(n));
    }
}
