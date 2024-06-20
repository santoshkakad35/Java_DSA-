package Serching;
import java.util.*;

public class serchMatrix {
    static boolean matrix(int[][] a, int target) {
        int n = a.length, m = a[0].length;
        int i = 0, j = m - 1;
        while (i<n && j>=0)  {
            // i = 0  so it go up last row && j = m-1 so it will go when j is not equal to 0
            if(a[i][j]==target) return true;

            if(target < a[i][j]) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] a = {{1,4,7,9}, {2,3,9,10}, {12,29,90,100}};
        int target = 10;
        System.out.println(matrix(a,target));
    }
}
