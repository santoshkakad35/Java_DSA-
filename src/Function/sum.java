package Function;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
//        int ans = sum3(10 , 20);
//        System.out.println(ans);
        String ans = greet("Santosh");
        System.out.println(ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n1");
        int n1 = in.nextInt();
        System.out.println("Enter the n2");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n1");
        int n1 = in.nextInt();
        System.out.println("Enter the n2");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static String greet(String name) {
        String message = "Hello" + name;
        return message;
    }
}
