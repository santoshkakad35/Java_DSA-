package SubarrayAndSlidingWindow;
import java.util.*;

// 1 Two Sum Leetcode
public class TwoSum {
    static int[] Leetcode1(int[] arr, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int[] res = new int[2];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if(mp.containsKey(rem)) {
                res[0] = mp.get(rem);
                res[1] = i;
                return res;
            }

            mp.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(Leetcode1(arr,target)));
    }
}
