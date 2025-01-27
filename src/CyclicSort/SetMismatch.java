package CyclicSort;
import java.util.*;

public class SetMismatch {
    public static int[] Leetcode645(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int idx = nums[i] - 1;
            if(nums[i] != nums[idx]) {
                swap(nums,i,idx);
            } else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1) {
                return new int[] {nums[j],j+1};
            }
        }

        return new int[] {-1,-1};
    }

    public static void swap(int[] nums,int st, int end) {
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(Leetcode645(arr)));
    }
}
