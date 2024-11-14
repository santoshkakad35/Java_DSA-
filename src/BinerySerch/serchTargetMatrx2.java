package BinerySerch;

import java.util.Arrays;

public class serchTargetMatrx2 {
    public static void main(String[] args) {
        int[][] a = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 16;

        System.out.println(Arrays.toString(matrix(a,target)));
    }

    static int[] matrix(int[][]a,int target) {
        int n = a.length,  m  = a[0].length;
        int st = 0, end = n * m - 1;
        while (st<=end) {
            int mid = st+(end-st)/2;
            int val = a[mid/m][mid%m];
            if(val == target) {
                return new int[] {mid/m, mid%m};
            }

            if(val>target) {
                end = mid-1;
            } else {
                st=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
