package Arrays;

import java.util.HashSet;

public class subArrContainsSum {
    static boolean subArray(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - k;
            if(set.contains(rem)) {
                return true;
            }

            set.add(rem);
        }
         return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,2,6,-6,3,2};
        int k = 5;
        System.out.println(subArray(arr,k));
    }
}
