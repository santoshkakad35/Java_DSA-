package PrefixSum;

// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?page=1&sprint=dcf7544cbc48a1105896e5e0dd76d067&sortBy=submissions
public class RowWithMax1s {
    static int checkOnes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1) {
                count++;
            }
        }
        return count;
    }
    static int gfgObz1(int[][]arr) {
        if(arr.length==0 ||arr==null) {
            return -1;
        }

        int max = Integer.MIN_VALUE, flag = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = checkOnes(arr[i]);
            if(max < count) {
                max = count;
                flag = i;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1,}, {0,0,1,1},{1,1,1,1},{0,0,0,0}};
        System.out.println("The max row contains 1's "+gfgObz1(arr));;
    }
}
