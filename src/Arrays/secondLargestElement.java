package Arrays;

public class secondLargestElement {
    static int checkInfo(int[] arr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > min) {
                min = arr[i];
            }
        return min;
    }

    static int secondMax(int[] arr) {
        int min = checkInfo(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secMax = checkInfo(arr);    // By agin call to the main function we get sec largest element.
        return secMax;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,8,4,7};
        System.out.println(secondMax(arr));
    }

}
