package Recursion;

import java.util.Scanner;

public class reverseNaturalNo {
    static void check(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        check(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        check(n);
    }
}
