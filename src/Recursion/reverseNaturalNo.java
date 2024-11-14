package Recursion;

import java.util.Scanner;

public class reverseNaturalNo {
    static void printRev(int n) {
        if(n==1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printRev(n-1);
    }
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        printRev(n);
    }
}
