package Recursion;

public class sumOfArr {
    static int sumOfArr(int[] arr, int idx) {
        if(idx == arr.length) {
            return 0;
        }

        int sum = sumOfArr(arr,idx+1);
        return sum + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int idx = 0;
        System.out.println(sumOfArr(arr,idx));;
    }
}
