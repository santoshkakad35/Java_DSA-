package Recursion;

public class gcd {
    static int isGcd(int x,int y) {
        if(y==0) {
            return x;
        }

        return isGcd(y, x % y);
    }
    public static void main(String[] args) {
        int x = 12;
        int y = 16;
        /*while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }

        System.out.println(y + " ");*/

        System.out.println(isGcd(x,y));
    }
}
