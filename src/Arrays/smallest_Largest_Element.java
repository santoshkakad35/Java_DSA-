package Arrays;

import java.util.Arrays;

public class smallest_Largest_Element {
    static void smallestLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 3, 6, 2};
        smallestLargest(arr);
    }
}
