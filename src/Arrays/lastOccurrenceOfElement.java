package Arrays;

import java.util.Scanner;

public class lastOccurrenceOfElement {
    static void check(int[] arr, int key) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                ans = i;
            }
        }
        System.out.println("The last Occuerance : "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 4, 5, 2};
        System.out.println("Enter the key element");
        int key = sc.nextInt();

        check(arr, key);
    }
}
