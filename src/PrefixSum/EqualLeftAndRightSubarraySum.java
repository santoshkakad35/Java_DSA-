package PrefixSum;
import java.util.*;

//https://www.geeksforgeeks.org/problems/equal-left-and-right-subarray-sum--170647/1?page=1&sprint=dcf7544cbc48a1105896e5e0dd76d067&sortBy=submissions
public class EqualLeftAndRightSubarraySum {
    static int gfgZu8L(int[] arr) {
        int total = 0;
        for(int num : arr) {
            total += num;
        }

        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            int right = total - left - arr[i];

            if(right == left) {
                return i;
            }

            left+= arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println("The middle index before and after sum equals is : "+gfgZu8L(arr));
    }
}
