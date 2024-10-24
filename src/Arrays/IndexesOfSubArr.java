package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class IndexesOfSubArr {
    static ArrayList<Integer> findSumSubArr(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1); // no answer case
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            int rem = sum-k;
            if(mp.containsKey(rem)) {
                int startingIndex = mp.get(rem)+1;
                list.set(0,startingIndex);
                list.add(i);
                break;
            }
            mp.put(sum,i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,2,6,-6,3,2};
        int k = 5;
        ArrayList<Integer> res = findSumSubArr(arr, k);
        if(res.get(0) == -1) {
            System.out.println("Not found");
            return;
        }

        System.out.println(res.get(0)+" "+res.get(1));
    }
}
