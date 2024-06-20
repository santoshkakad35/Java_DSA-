package Recursion;

import java.util.Scanner;

public class gcd {
    static int check(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 24;
        int y = 15;
        System.out.println(check(x, y));
    }
}
