package Arrays;

import java.util.Arrays;
//645 SetMismatch
public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }

        int k = 0;
        for(int j=0;j<nums.length;j++) {

            if(nums[j]!=j+1) {
                return new int[] {nums[j], j+1};
            }
        }

        return new int[] {-1,-1};
    }


    public static void swap(int[] nums, int low, int high) {
        int temp  = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}