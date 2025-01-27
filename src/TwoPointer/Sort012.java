package TwoPointer;
import java.util.*;
//75 Sort012 Leetcode
public class Sort012 {
    static void Leetcode75(int[] arr) {
        int st = 0, med = 0,end = arr.length-1;
        while(med <= end) {
            if(arr[med] == 0) {
                swaps(arr,st,med);
                st++;
                med++;
            }

            else if(arr[med] == 1) {
                med++;
            }

            else if(arr[med] == 2) {
                swaps(arr,med,end);
                end--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swaps(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        Leetcode75(arr);
    }
}
