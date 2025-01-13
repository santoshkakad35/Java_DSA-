package Sorting;

public class Radix {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr);

        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }

        print(arr);
    }

    static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 2};
        radixSort(arr);
    }
}
