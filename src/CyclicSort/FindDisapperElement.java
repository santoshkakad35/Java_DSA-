package CyclicSort;
import java.util.*;

//448. Find All Numbers Disappeared in an Array
public class FindDisapperElement {
    public static List<Integer> Leetcode448(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while(i<nums.length) {
            int idx = nums[i]-1;
            if(nums[i] != nums[idx]) {
                swap(nums,i,idx);
            } else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1) {
                arr.add(j+1);
            }
        }
        return arr;
    }

    private static void swap(int[] nums, int st, int end) {
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Leetcode448(nums));;
    }
}
