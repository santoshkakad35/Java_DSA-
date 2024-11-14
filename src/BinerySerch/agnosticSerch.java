package BinerySerch;

import java.util.Scanner;

public class agnosticSerch {

    static int agnosticSerch(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[st] < arr[end];
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (target == arr[mid]) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {90, 74, 17, 12, 11, 5, 2, 1};
        int target = 11;
        System.out.println(agnosticSerch(arr, target));
    }
}
