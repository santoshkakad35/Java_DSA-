package Two_Dimension_Array;
/* sum of matrix */
import java.util.Scanner;

public class sumofMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        System.out.println("First Matrix");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


        int [][] c = new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum Matrix");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }


}
