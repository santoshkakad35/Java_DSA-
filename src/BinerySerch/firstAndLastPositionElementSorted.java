package BinerySerch;

import java.util.Arrays;

public class firstAndLastPositionElementSorted {
    public static int[] check(int[] nums,int target) {
        int[] ans = new int[2];
        ans[0] = first(nums,target);
        ans[1] = last(nums,target);
        return ans;
    }
    public static int first(int[] nums, int target) {
        int st = 0, end = nums.length-1;
        int idx = -1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if(nums[mid] == target) {
                idx = mid;
            }

            if(nums[mid]>= target) {
                end = mid - 1;
            } else {
                st  = mid + 1;
            }
        }
        return idx;
    }

    public static int last(int[] nums, int target) {
        int st = 0, end = nums.length-1, idx = -1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if(nums[mid] == target) {
                idx =  mid;
            }

            if(nums[mid] <= target) {
                st  = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(check(arr,target)));
    }
}
