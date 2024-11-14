package Matrix;

import java.util.Scanner;

public class PrintTheMatrix {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int m = sv.nextInt();
        int n = sv.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sv.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
