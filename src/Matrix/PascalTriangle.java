package Matrix;

public class PascalTriangle {
    static void printMatrix(int[][] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void pascalTriangle(int num) {
        int[][] arr = new int[num][];
        for(int i=0;i<arr.length;i++) {
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for(int j=1;j<i;j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        printMatrix(arr);
    }
    public static void main(String[] args) {
        int num = 4;
        pascalTriangle(num);
    }
}
