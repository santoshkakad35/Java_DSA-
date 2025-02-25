package BinerySerch;
/* implement recursion using binery serch */

public class recursiveBinerySerch {
    static boolean check(int[] arr, int st, int end, int target) {
        if (st > end) return false; // base case
        int mid = (st + end) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return check(arr, st, mid - 1, target);
        } else {
            return check(arr, mid + 1, end, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        int target= 3;
        System.out.println( check(arr, 0, arr.length - 1, target));
    }
}


