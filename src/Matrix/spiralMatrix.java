package Matrix;

import java.util.Scanner;

public class spiralMatrix {
    static void SpiralMatrix(int[][] a, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int total = 0;
        while(total < r*c) {
            // top row -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && total <= r*c;j++) {
                System.out.print(a[topRow][j]+" ");
                total++;
            }
            topRow++;

            // right col -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow&& total <= r*c;i++) {
                System.out.print(a[i][rightCol]+" ");
                total++;
            }
            rightCol--;

            // bottom row -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol&& total <= r*c;j--) {
                System.out.print(a[bottomRow][j]+" ");
                total++;
            }
            bottomRow--;


            // left col -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow&&total <= r*c;i--) {
                System.out.print(a[i][leftCol]+" ");
                total++;
            }
            leftCol++;

        }
    }


    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r  = sv.nextInt();
        System.out.println("Enter the columns");
        int c = sv.nextInt();

        System.out.println("Enter the elements of matrix a");
        int[][] a = new int[r][c];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                a[i][j] = sv.nextInt();
            }
        }
        SpiralMatrix(a,r,c);
    }
}
