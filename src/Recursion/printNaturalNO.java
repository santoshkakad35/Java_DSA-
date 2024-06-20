package Recursion;

import java.util.Scanner;

public class printNaturalNO {
    static void printIncreasing(int n) {
        //  Base Case
        if (n == 1) {
            System.out.print(n + "  ");
            return;
        }
        // Recursive Case
        printIncreasing(n - 1);
        // self work
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
