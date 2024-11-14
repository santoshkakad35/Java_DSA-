package BinerySerch;

public class dublicatedElement {
    static int check(int[] a, int target) {
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[st] == a[mid] && a[mid] ==a[end]) {
                st++;
                end--;

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
        int[] arr = {1, 1, 1, 1, 1, 2, 3, 1, 1};
        int target = 2;
        System.out.println(check(arr,target));
    }
}
