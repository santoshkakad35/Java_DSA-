package Arrays;

//https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays
public class MaximumScorefromSubarrayMinimums {
    static int gfgOp2w(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int sum = 0, max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + arr[i + 1];

            if (sum > max) {
                max = sum;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        System.out.println(gfgOp2w(arr));
        ;
    }
}
