package Two_Dimension_Array;
/* product of matrix */
import java.util.Scanner;

public class productofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r1");
        int r1  = sc.nextInt();
        System.out.println("Enter c1");
        int c1 = sc.nextInt();
        System.out.println("Enter first matrix");
        int[][] one = new int[r1][c1];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                one[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter r2");
        int r2  = sc.nextInt();
        System.out.println("Enter c2");
        int c2 = sc.nextInt();
        System.out.println("Enter second matrix");
        int[][] two = new int[r2][c2];
        for(int i=0;i<two.length;i++) {
            for(int j=0;j<two[0].length;j++) {
                two[i][j] = sc.nextInt();
            }
        }


        if(c1!=r2) {
            System.out.println("Invalid input");
        }

        int[][] prod = new int[r1][c2];
        for(int i=0;i<prod.length;i++) {
            for(int j=0;j<prod[0].length;j++) {
                for(int k=0;k<c1;k++) {
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        System.out.println("The product of two matrix");
        for (int i=0;i<prod.length;i++) {
            for(int j=0;j<prod[0].length;j++) {
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }

    }
}
