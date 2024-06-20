package Arrays;

public class increasingOrderOfsq {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] check(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int k = n - 1;
        int l = 0, r = n - 1;
        while (l <= r) {
            if ((Math.abs(arr[l])) > (Math.abs(arr[r]))) {
                ans[k--] = arr[l] * arr[l];
                l++;
            } else {
                ans[k--] = arr[r] * arr[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};

        int[] q = check(arr);
        printArr(q);
    }
}
