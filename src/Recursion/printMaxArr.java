package Recursion;

public class printMaxArr {
    static int maxArr(int[] arr, int idz) {
        if(idz == arr.length-1) {
            return arr[idz];
        }

        int smallAns  = maxArr(arr,idz+1);
        return Math.max(arr[idz],smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 2, 9};
        int idz = 0;
        System.out.println(maxArr(arr,idz));
    }
}
