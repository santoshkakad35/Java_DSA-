package Arrays;

import java.util.Arrays;
// 287 find the duplicate Number
public class findDuplicateNo {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }

        return nums.length;
    }

    public static void swap(int[] nums, int st, int end) {
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println((findDuplicate(arr)));;
    }
    
}