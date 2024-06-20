package Recursion;

import java.util.Scanner;

public class evenAndOddSeries {
    static int check(int n) {
        if(n == 0) return 0;
        if(n % 2 == 0) {
            return check(n -1)-n;
        } else {
            return check(n-1)+n;
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =4;
        System.out.print(check(n));
    }
}
