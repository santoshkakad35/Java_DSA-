package Arrays;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
public class UnionofTwoSortedArray {
    static void checkUnion(int[] a1, int[] a2) {
        ArrayList<Integer> nums = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                if (nums.isEmpty() || nums.get(nums.size() - 1) != a1[i]) {
                    nums.add(a1[i]);
                }
                i++;
            } else if (a1[i] > a2[j]) {
                if (nums.isEmpty() || nums.get(nums.size() - 1) != a2[j]) {
                    nums.add(a2[j]);
                }
                j++;
            } else {
                if (nums.isEmpty() || nums.get(nums.size() - 1) != a1[i]) {
                    nums.add(a1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < a1.length) {
            if (nums.isEmpty() || nums.get(nums.size() - 1) != a1[i]) {
                nums.add(a1[i]);
            }
            i++;
        }

        while (j < a2.length) {
            if (nums.isEmpty() || nums.get(nums.size() - 1) != a2[j]) {
                nums.add(a2[j]);
            }
            j++;
        }

        System.out.println(nums);
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 6, 7};

        checkUnion(a1, a2);
    }
}
