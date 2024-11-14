package BinerySerch;

/* we find target element in rotated array using binery serch */

public class targetElement{
    static int check(int[] a, int target) {
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < a[end]) {
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > a[st] && target <= a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        int target = 4;
        System.out.println("Target element is found at index " + check(a, target));
    }
}
