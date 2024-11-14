package Arrays;

import java.util.Arrays;
import java.util.HashMap;
// 1 two sum
public class sum2 {

    static int[] targetSum(int[] arr, int k) {
        HashMap<Integer,Integer> mp =new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int rem = k - arr[i];
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
        int k = 9;
        System.out.println(Arrays.toString(targetSum(arr,k)));;
    }

    public static class firstSecThird {
        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1, 50};

        }
    }
}
