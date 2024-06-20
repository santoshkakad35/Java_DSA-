package Two_Dimension_Array;
/* Upper trianguler */
import java.util.Scanner;

public class UpperTrianguler {
    static void printArr(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if  (i <= j)  {
                    System.out.print(arr[i][j]+" ");

                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 3;
        int c = 3;
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr,r,c);
    }
}
