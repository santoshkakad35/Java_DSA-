package SubarrayAndSlidingWindow;
//209. Minimum Size Subarray Sum leetcode
public class MinimumSizeSubarraySum {
    static int LeetCode209(int[] arr, int target) {
        int sum = 0, min = Integer.MAX_VALUE, st = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= target) { // Shrink the window while the sum is >= target
                min = Math.min(min, end - st + 1); // Update minimum size
                sum -= arr[st++]; // Shrink from the start
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Minimum Size of subarray: " + LeetCode209(arr, target));
    }
}
