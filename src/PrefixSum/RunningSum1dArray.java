package PrefixSum;

import java.util.Arrays;

// 1480 Leetcode  find prefix sum
public class RunningSum1dArray {
    static void prefixSum(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        prefixSum(arr);
    }
}
