package Arrays;
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubarrayOfK {
    public static void subarr(int[] arr, int k) {
        int sum = 0, maxLen = 0;
        int i = 0;
        while(i<arr.length && i<k) {
            sum = sum+arr[i];
            i++;
        }

        maxLen = sum;
        for (int j = 1; j < arr.length - k; j++) {
            int prev = arr[i-1];
            int next = arr[i+k-1];
            sum = sum - prev + next;
            maxLen = Math.max(sum,maxLen);
        }

        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k  = 2;
        subarr(arr,k);
    }
}
