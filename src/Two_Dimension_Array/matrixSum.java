package Two_Dimension_Array;

import java.util.Scanner;

public class matrixSum {
    static void matrixSum(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row & col");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int r1,c1,r2,c2;
        System.out.println("Enter r1");
        r1 = sc.nextInt();
        System.out.println("Enter c1");
        c1 = sc.nextInt();
        System.out.println("Enter r2");
        r2 = sc.nextInt();
        System.out.println("Enter c2");
        c2 = sc.nextInt();

        matrixSum(arr,r1,c1,r2,c2);
    }
}
