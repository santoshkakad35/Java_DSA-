package Arrays;

import java.util.Scanner;

public class frequencyOfElement {
    static void printArr(int[] arr) {
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void freq(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if (x == -1) continue;
            for (int j = 0; j < arr.length; j++) {
                if (x == arr[j]) {
                    count++;
                    arr[j] = -1;
//
                }

            }

            System.out.println("Frequency of array : " + x + " = " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array's element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        freq(arr);

    }
}
