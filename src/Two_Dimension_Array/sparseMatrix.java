package Two_Dimension_Array;

import java.util.Scanner;

public class sparseMatrix {
    static void printArr(int[][] arr, int c, int r) {
        int total = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 0) {
                    total++;
                }

            }

        }

        if (total >= (r * c / 2)) {
            System.out.print("sparse matrix");
        } else {
            System.out.println("Not sparse matrix");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 3;
        int c = 3;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr, r, c);
    }

}
