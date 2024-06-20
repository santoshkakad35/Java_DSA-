package Arrays;

public class third_Largest_Element {
    static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLargest(int[] arr) {
        int max = maxElement(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondLargest = maxElement(arr);
        return secondLargest;
    }

    static int thirdlarget(int[] arr) {
        int max = secondLargest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int thirdlargest = maxElement(arr);
        return thirdlargest;
    }


    public static void main(String[] args) {
        int[] arr = {10, 22, 43, 5, 2};
        System.out.println(thirdlarget(arr));
    }
}
