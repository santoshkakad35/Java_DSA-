package Serching;
import java.util.*;
public class TWODmatrixusingBS {
    static boolean matrix(int[][] a , int target) {
        int n = a.length, m = a[0].length;
        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midELe = a[mid / m][mid % m];

            if(midELe == target) return true;
            if(target < midELe) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println(matrix(a, target));
    }
}
