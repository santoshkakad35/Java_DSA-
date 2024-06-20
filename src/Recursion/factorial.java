package Recursion;

import java.util.Scanner;

public class factorial {
    static int check(int n) {
        if (n == 0) return 1;


        int smallAns = check(n-1);
        return n*smallAns;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.print(check(n));
    }
}