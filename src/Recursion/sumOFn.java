package Recursion;

import java.util.Scanner;

public class sumOFn {
    static int check(int num) {
        if(num == 0) return 0;
        int ans = check(num - 1);
        return ans + num;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        System.out.print(check(num));
    }
}
