package Matrix;

import java.util.Scanner;

public class sumofTwoEnds {
    static void sumofEnds(int[][]a, int x1,int y1,int x2,int y2) {
        int sum = 0;
        for(int i=x1;i<=x2;i++) {
            for(int j=y1;j<=y2;j++) {
                sum += a[i][j];
            }
        }

        System.out.println(sum);
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

        int x1 = 3, x2 = 5;
        int y1 = 1 , y2 = 4;
        sumofEnds(a,x1,y1,x2,y2);
    }
}
