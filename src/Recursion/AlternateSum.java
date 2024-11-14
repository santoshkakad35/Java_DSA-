package Recursion;

public class AlternateSum {
    static int alternateSeq(int n) {
        if(n==0) return 0;
        if(n%2==0) {
            return alternateSeq(n-1)-n;
        }else {
            return alternateSeq(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(alternateSeq(n));;
    }
}
