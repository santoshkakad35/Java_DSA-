package Recursion;

public class MultipleOfNNumbers {
    static void multiple(int n, int k) {
        if(k==1) {
            System.out.print(n + " ");
            return;
        }

        multiple(n,k-1);
        System.out.print(k * n+" ");;

    }
    public static void main(String[] args) {
        int n = 12;
        int k = 5;
        multiple(n,k);
    }
}
