package Recursion;

import java.util.Scanner;

public class sumofDigit {
    static int printArr(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int sum = printArr(n / 10);
        int ans = sum + n % 10;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(printArr(1234));
    }
}
