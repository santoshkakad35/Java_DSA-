package Arrays;

public class sumOfArray {
    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        System.out.println(sumArr(arr));
    }
}
