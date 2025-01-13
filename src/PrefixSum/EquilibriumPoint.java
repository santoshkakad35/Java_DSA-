package PrefixSum;
import java.util.*;

//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&status=solved,attempted&sortBy=submissions
public class EquilibriumPoint {

    public static int gfgAB12(int nums[]) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }

        int pref = 0, suff = 0;
        for(int i=0;i<nums.length;i++) {
            suff = sum - pref - nums[i];

            if (pref == suff) {
                return i + 1;
            }

            pref += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(gfgAB12(arr));;
    }
}
