package PrefixSum;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
public class ProductArrayPuzzle {
    static int[] gfgQyI8(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i-1] * arr[i-1];
        }

        int right = 1;
        for(int i=n-1;i>=0;i--) {
            res[i] *= right;
            right *= arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(gfgQyI8(arr)));
    }
}
