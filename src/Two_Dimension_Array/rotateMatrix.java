package Two_Dimension_Array;

import java.util.Scanner;

public class rotateMatrix {
    static void print(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArr(int[][] arr1, int r1, int c1) {
        for (int i = 0; i < arr1.length; i++) {
            int l = 0;
            int r = arr1[0].length - 1;
            while (l < r) {
                int temp = arr1[i][l];
                arr1[i][l] = arr1[i][r];
                arr1[i][r] = temp;

                l++;
                r--;
            }
        }
        print(arr1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = 3;
        int c1 = 3;

        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the first matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        printArr(arr1, r1, c1);
    }
}
