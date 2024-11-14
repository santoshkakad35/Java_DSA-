package Arrays;

public class fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 10;  // Example input: the position of the Fibonacci number to return
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}


