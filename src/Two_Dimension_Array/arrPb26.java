package Two_Dimension_Array;
/* 2d - Array */
import java.util.Scanner;

public class arrPb26 {

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();
        int[] [] arr = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr);

    }
}
