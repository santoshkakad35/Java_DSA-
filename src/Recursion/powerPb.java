package Recursion;

import java.util.Scanner;

public class powerPb {
    static int check(int p, int q) {
        if(q == 0) return 1;
        if(p==0) return 0;

        int ans = check(p, q-1);
        return ans * p;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 2;
        int q= 5;
        System.out.print(check(p,q));
    }
}
