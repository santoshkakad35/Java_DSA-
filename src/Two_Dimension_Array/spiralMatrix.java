package Two_Dimension_Array;

import java.util.Scanner;
/* spiral method of N*N */
public class spiralMatrix {
    static void printArr(int[][] arr,int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void print(int[][] arr, int n) {
        int topR = 0, bottomR = n-1, leftC = 0, rightC=n-1;
        int total = 1;
        while(total<=n*n) {
            for(int j=leftC;j<=rightC && total<=n*n;j++) {
                arr[topR][j]= total++;
            }
            topR++;
            for(int i=topR;i<=bottomR && total<=n*n;i++) {
                arr[i][rightC] =  total++;
            }
            rightC--;
            for(int j=rightC;j>=leftC && total<=n*n ;j--) {
                arr[bottomR][j]=  total++;
            }
            bottomR--;
            for(int i=bottomR;i>=topR && total<=n*n ;i--) {
                arr[i][leftC] = total++;
            }
            leftC++;

        }

        printArr(arr,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        print(arr,n);

    }
}
