package SubarrayAndSlidingWindow;
// Longest Sub-Array with Sum K
// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?page=1&sprint=3b827e9e40ea33b6d2bae34e8d0760ce&sortBy=submissions
import java.util.*;

public class LongestSubArrayWithSumK {
    static int longestSubArr(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            int rem = sum - k;
            if(mp.containsKey(rem)) {
                int len = i - mp.get(rem);
                max = Math.max(len, max);
            }

            if(!mp.containsKey(sum)) {
                mp.put(sum,i);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Longest Subarray is " +longestSubArr(arr, k));;
    }
}
