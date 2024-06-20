package Two_Dimension_Array;

import java.util.Scanner;

public class rotationMatrix {
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    static void transposeInPlace(int[][] arr, int c1, int r1) {
        for (int i = 0; i < c1; i++) {
            for (int j = i; j < r1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
//        print(arr);
    }
    static void rotate(int[][] arr, int r1, int c1) {
        transposeInPlace(arr, r1, c1);

        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }

        print(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r1 = sc.nextInt();
        System.out.println("Enter the col");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        rotate(arr, r1,c1);
    }
}
