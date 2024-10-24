package Arrays;
// 560 subarray sum equal to k
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
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
        System.out.println(subarraySum(arr,k));;
    }
}
