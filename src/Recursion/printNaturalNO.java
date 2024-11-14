package Recursion;

import java.util.Scanner;

public class printNaturalNo {

    static void printNo(int n) {
        if(n==1) {
            System.out.println(1);
            return;
        }
        printNo(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        printNo(n);
    }
}
