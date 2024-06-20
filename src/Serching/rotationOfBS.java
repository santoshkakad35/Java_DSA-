package Serching;

/* rotation array using binery serch find k element */

public class rotationOfBS {
    static int rotate(int[] arr) {
        int st = 0, end = arr.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[end]) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(rotate(arr));
    }
}
