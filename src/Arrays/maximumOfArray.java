package Arrays;

public class maximumOfArray {
    static void check(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max element : " + max);
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        check(arr);
    }
}
