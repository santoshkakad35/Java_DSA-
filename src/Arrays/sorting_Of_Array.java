package Arrays;

import java.util.Arrays;

public class sorting_Of_Array {
    static void rev(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[] check(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    rev(arr, i, j);
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 1, 4};
//         int key = 3;
        int[] ans = check(arr);
        System.out.println(Arrays.toString(ans));
    }
}
