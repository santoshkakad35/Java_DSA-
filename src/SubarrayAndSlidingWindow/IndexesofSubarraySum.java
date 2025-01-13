package SubarrayAndSlidingWindow;
import java.util.*;
//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&status=solved,attempted&sortBy=submissions
public class IndexesofSubarraySum {
    static  ArrayList<Integer>  gfg1AQ(int[] arr, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        mp.put(0,-1);
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            int rem = sum - target;
            if(mp.containsKey(rem)) {
                int stIdx = mp.get(rem)+1;
                num.add(stIdx+1);
                num.add(i+1);
                return num;
            }

            if (!(mp.containsKey(sum))) {
                mp.put(sum, i);
            }

        }

        num.add(-1);
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(gfg1AQ(arr,target));;
    }
}
