package Recursion;

import java.util.Scanner;

public class printTableSequence {
    static void check(int num, int k) {
        if (k == 0) {
            return;
        }

        check(num, k - 1);
        System.out.println(num * k);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 12;
        int k = 5;
        check(num, k);
    }
}
