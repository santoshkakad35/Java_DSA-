package CyclicSort;
import java.util.*;

//287. Find the Duplicate Number
public class FindDuplicateNumber {
    public static int Leetcode287(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int idx = nums[i];
            if(nums[i] != nums[idx]) {
                swap(nums,i,idx);
            } else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j) {
                return nums[j];
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(Leetcode287(arr));;
    }
}
