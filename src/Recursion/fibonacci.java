package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int fibno(int n) {
        // base case
        if(n==0) {
            return 0;
        }

        if(n==1) {
            return 1;
        }

        int fibi1 = fibno(n-1);
        int fibi2 = fibno(n-2);
        return fibi1 + fibi2;
    }
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        System.out.print(fibno(n));
    }
}
