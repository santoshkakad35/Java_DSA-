package Arrays;

public class sequenceEven_odd {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void checkInfo(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    static int[] sort(int[] arr) {
        int left = 0, right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] % 2 == 0) {
                checkInfo(arr, left, right);

            }
            if (arr[i] % 2 == 0) {
                left++;
            }

            if (arr[i] % 2 != 0) {
                right--;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {23, 2, 14, 5, 6};
        int[] ans = sort(arr);
        printArr(ans);
    }
}
