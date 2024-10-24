package Arrays;

import java.util.HashMap;
//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
public class longestSubArray {

    static int findlongSubArr(int[] arr, int k) {
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int rem = sum - k;
            if(mp.containsKey(rem)) {
                int len = i - mp.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!mp.containsKey(sum)) {
                mp.put(sum,i);
            }
         }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10,0,0,5,2,7};
//        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 5;
        System.out.println(findlongSubArr(arr,k));;
    }
}
