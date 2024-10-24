package Arrays;

import java.util.Arrays;

public class AlternateMaxMin {

    public static int[] rearrangeMaxMin(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] result = new int[n];
        int low = 0;  // Pointer for minimum elements
        int high = n - 1;  // Pointer for maximum elements
        int index = 0;  // Index to fill the result array

        // Rearrange the array in alternate max-min sequence
        while (low <= high) {
            if (index % 2 == 0) {
                result[index] = arr[high--];  // Take max element
            } else {
                result[index] = arr[low++];  // Take min element
            }
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 2, 7, 5, 6, 4};
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangeMaxMin(arr)));
    }
}

