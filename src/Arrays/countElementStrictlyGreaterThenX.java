package Arrays;

import java.util.Scanner;

public class countElementStrictlyGreaterThenX {
    static void check(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                count++;
            }
        }
        System.out.println("Count of no greater then x :) " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " size of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element");
        int key = sc.nextInt();
        check(arr, key);
    }
}
