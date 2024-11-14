package Recursion;

public class PowerofPQ {
    static int power(int a,int b) {
        if(b==0) {
            return 1;
        }

        int ans = power(a,b-1);
        return ans * a;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(power(a,b));;
    }
}
