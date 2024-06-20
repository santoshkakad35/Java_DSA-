package Arrays;

import java.util.Scanner;

public class max_min_element {
    static void check(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Max no : " + max);
        System.out.println();
        System.out.print("Min no : " + min);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 50, 13, 18, 3};
        check(arr);
    }
}
