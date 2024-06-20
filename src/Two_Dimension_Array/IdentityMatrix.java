package Two_Dimension_Array;

import java.util.Scanner;

public class IdentityMatrix {
    static void printArr(int[][] arr, int c, int r) {
        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + j == 2 && arr[i][j] == 1) {
                    flag = 1;
                }
            }

        }
        if (flag == 0) {
            System.out.print("Not Identity");
        } else {
            System.out.println("Identity");
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
