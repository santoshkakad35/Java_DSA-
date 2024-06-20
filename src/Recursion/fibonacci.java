package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int check(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int p1 = check(n - 1);
        int p2 = check(n - 2);

        return p1 + p2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        System.out.print(check(n));
    }
}
