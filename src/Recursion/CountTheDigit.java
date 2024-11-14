package Recursion;

public class CountTheDigit {
    static int countDigit(int n) {
        if(n==0) {
            return 0;
        }

        return  1 + countDigit(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countDigit(n));
    }
}
