package Recursion;

import java.util.Scanner;

// gcd using Recursion
public class euclids {

    // ** Euclid's algorithm
    static int print(int x, int y) {
        if(y==0) {
            return x;
        }

       return print(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print(print(x,y));
    }

}
