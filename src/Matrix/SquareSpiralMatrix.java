package Matrix;

public class SquareSpiralMatrix {
    static void squareIncSpiral(int n) {
        int[][] ans = new int[n][n];
        int topRow = 0, bottomRow =  n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while(curr <= n*n) {
            // top row -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && curr <= n*n;j++) {
                ans[topRow][j] = curr++;
            }
            topRow++;

            // right col -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && curr <= n*n;i++) {
                ans[i][rightCol] = curr++;

            }
            rightCol--;

            // bottom row -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && curr <= n*n;j--) {
                ans[bottomRow][j] = curr++;
            }
            bottomRow--;


            // left col -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && curr <= n*n;i--) {
                ans[i][leftCol] = curr++;
            }
            leftCol++;

        }
    }

    public static void main(String[] args) {
        int n = 3;
        squareIncSpiral(n);
    }
}
