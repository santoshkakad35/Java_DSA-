package CyclicSort;
import java.util.*;

//442. Find All Duplicates in an Array
public class FindAllDuplicatesArray {
    public static List<Integer> Leetcode442(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                res.add(nums[j]);
            }
        }

        return res;
    }

    public static void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println( Leetcode442(arr));
    }
}
