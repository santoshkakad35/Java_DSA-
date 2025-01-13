package Arrays;

import java.util.Arrays;

public class PlacedEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i = 0, j = arr.length - 1;

        while (i < j) {
            // Move i to the right until a 0 is found
            while (arr[i]%2 ==0 && i < j) {
                i++;
            }
            // Move j to the left until a 1 is found
            while (arr[j]%2 != 0 && i < j) {
                j--;
            }
            // Swap 0 at i and 1 at j
            if (arr[i]%2!=0 &&  arr[j] %2==0) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}

