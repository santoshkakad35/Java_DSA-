package Arrays;

public class sequence_00111 {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void check(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
            }
            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }

        printArr(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0};
        check(arr);
    }
}
