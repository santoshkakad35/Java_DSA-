package Two_Dimension_Array;
/* sum of all row & col */
import java.util.Scanner;

public class SumofrowCol {
    static void print(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArr(int[][] arr1, int r1, int c1) {
        int i, j;
        for (i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (j = 0; j < arr1[0].length; j++) {
                sum = sum + arr1[i][j];
            }
            System.out.printf("row : %d = %d\n", i + 1, sum);
        }

        for (i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (j = 0; j < arr1[0].length; j++) {
                sum = sum + arr1[j][i];
            }
            System.out.printf("col : %d = %d\n", i + 1, sum);
        }
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
