package Matrix;
// Leetcode 73
public class BooleanMatrix {
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void gfgANz9(int[][] arr) {
        if(arr.length == 0 || arr == null) {
            return;
        }
        int n = arr.length;
        int m = arr[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[i] || col[j]) {
                    arr[i][j]  = 1;
                }
            }
        }

        print(arr);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0},{0,0}};
        gfgANz9(arr);
    }
}
