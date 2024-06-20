package Two_Dimension_Array;

import java.util.Scanner;
/* equal or not matrix */
public class EqualorNotMatrix {
    static void print(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArr(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {
        if (r2 != c1) {
            System.out.print("Invalid Matrix");
        }
        int equal = 1;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    equal = 0;
                    break;
                }
            }
        }

        if (equal == 1) {
            System.out.println("Matrix is equal");
        } else {
            System.out.print("Matrix is not equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = 2;
        int c1 = 2;
        int r2 = 2;
        int c2 = 2;

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the first matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        printArr(arr1, arr2, r1, c1, r2, c2);
    }
}
