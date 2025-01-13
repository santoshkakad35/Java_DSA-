package Matrix;

import java.util.Scanner;

public class TransposeOfMatrix {
    static void printMatrix(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void TransposeOfMatrix(int[][]a , int r1 ,int c1) {
//        int[][] transpose = new int[r1][c1];
//        for(int i=0;i<r1;i++) {
//            for(int j=0;j<c1;j++) {
//                transpose[i][j] = a[j][i];
//            }
//        }
//
        // In place transpose
        if (r1 != c1) {
            System.out.println("In-place transpose is not possible for non-square matrices.");
            return;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = i; j < c1; j++) { // Ensure j starts from i
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printMatrix(a);

    }
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r1  = sv.nextInt();
        System.out.println("Enter the columns");
        int c1 = sv.nextInt();

        System.out.println("Enter the elements of matrix a");
        int[][] a = new int[r1][c1];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                a[i][j] = sv.nextInt();
            }
        }

        TransposeOfMatrix(a,r1,c1);
    }
}
