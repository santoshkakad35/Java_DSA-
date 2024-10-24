package Arrays;

import java.util.Arrays;

public class MergeSortedArr {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};  // The array with extra space
        int[] nums2 = {2, 5, 6};           // The second sorted array
        int m = 3;                         // Actual number of elements in nums1
        int n = 3;                         // Number of elements in nums2
        merge(nums1, m, nums2, n);
    }
}
