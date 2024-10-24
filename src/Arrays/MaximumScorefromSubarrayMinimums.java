package Arrays;
//https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays
public class MaximumScorefromSubarrayMinimums {
    static int check(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max,arr[i-1]+arr[i]);
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        System.out.println(check(arr));;
    }
}
