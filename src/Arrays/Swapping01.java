package Arrays;

import java.util.Arrays;

public class Swapping01 {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i = 0, j = a.length - 1;

        while (i < j) {
            if (a[i] == 1 && a[j] == 0) {
                swap(a, i, j);
                i++;
                j--;
            }
            if (a[i] == 0 && i < j) {
                i++;
            }

            if (a[j] == 1 && i < j) {
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
