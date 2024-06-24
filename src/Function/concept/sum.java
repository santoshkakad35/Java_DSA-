package Function.concept;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum();
        int ans = sum2();
        System.out.println("Sum : "+ ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n1");
        int n1 = in.nextInt();
        System.out.println("Enter the n2");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("sum : " + sum);
    }

    // return type function

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n1");
        int n1 = in.nextInt();
        System.out.println("Enter the n2");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;

        // after return function nothing can execute
    }
}

