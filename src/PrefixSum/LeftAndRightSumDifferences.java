package PrefixSum;

import java.util.Arrays;

// 2574 Leetcode
public class LeftAndRightSumDifferences {
    static void LeftAndRightDiff(int[] arr) {
        int[] left = new int[arr.length];
        left[0] = 0;
        int k = 1;
        for(int i=1;i<arr.length;i++) {
            left[k++] = arr[i-1] + left[i-1];
        }

        int[] right = new int[arr.length];
        right[arr.length-1] = 0;
        int j = arr.length-2;
        for(int i=arr.length-2;i>=0;i--) {
            right[j--] = arr[i+1] + right[i+1];
        }

        int total = 0;
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            ans[total++] = Math.abs(left[i] - right[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};
        LeftAndRightDiff(arr);
    }
}
