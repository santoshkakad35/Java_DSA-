package PrefixSum;
// Leetcode 525
import java.util.HashMap;

public class ContiguousArray {
    static int LeetCode525(int[] arr) {
        if(arr.length == 0 || arr == null) {
            return -1;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0)?-1: 1;
            if(mp.containsKey(sum)) {
                int len = i - mp.get(sum);
                max = Math.max(max, len);
            } else {
                mp.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,0,0,0,0,1,0,0};
        System.out.println("the maximum length of a contiguous subarray with an equal number of 0 and 1 :- "+(LeetCode525(arr)));;
    }
}
