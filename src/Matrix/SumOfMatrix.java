package Matrix;

import java.util.Scanner;

public class SumOfMatrix {
    static void printMatrix(int[][] sum) {
        for(int i=0;i<sum.length;i++) {
            for(int j=0;j<sum[i].length;j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void SumOfMatrices(int[][]a , int[][] b,int r1, int c1, int r2, int c2) {
        int[][] sum = new int[r1][c1];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrix(sum);
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

        System.out.println("Enter the rows");
        int r2  = sv.nextInt();
        System.out.println("Enter the columns");
        int c2 = sv.nextInt();

        System.out.println("Enter the elements of matrix b");
        int[][] b = new int[r2][c2];
        for(int i=0;i<b.length;i++) {
            for(int j=0;j<b[i].length;j++) {
                b[i][j] = sv.nextInt();
            }
        }

        SumOfMatrices(a,b,r1,c1,r2,c2);
    }

}
