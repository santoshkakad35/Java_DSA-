package PrefixSum;
import java.util.*;

// Leetcode 713
public class SubarrayProductLessThanK {
    static int Leetcode713(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 1) {
            return 0;
        }
        int st = 0, prod = 1, count = 0;

        for (int end = 0; end < nums.length; end++) {
            prod *= nums[end];  // expand the window
            while (prod >= k) { // Shrink window if product >= k
                prod /= nums[st];
                st++;
            }

            count += (end - st + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;
        System.out.println(Leetcode713(arr,k));
    }
}
