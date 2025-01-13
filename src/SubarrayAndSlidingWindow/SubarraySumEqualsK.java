package SubarrayAndSlidingWindow;

import java.util.*;

//560. Subarray Sum Equals K (Leetcode)
public class SubarraySumEqualsK {
    static int SubArrSumEqualsK(int[] arr, int k) {
        int sum = 0 , count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            int rem = sum - k;
            if (mp.containsKey(rem)) {
                count += mp.get(rem);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println("Maximum subarray sum equal to k : "+SubArrSumEqualsK(arr,k));;
    }
}
