package PrefixSum;
// 2485 Leetcode
public class FindThePivotInteger {
    static int FindPivotIdx(int n) {
        int sum = 0;
        int total = n*(n+1)/2;
        for(int i=1;i<=n;i++) {
            sum+=i;
            if(sum == total) {
                return i;
            }
            total -= i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(FindPivotIdx(n));;
    }
}
