package Arrays;

import java.util.Arrays;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }

        int index = arr2.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }


        Arrays.sort(arr3);
        int[] temp = new int[arr3.length];
        int j = 0;
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] != arr3[i + 1]) {
                temp[j++] = arr3[i];
            }

        }
        temp[j++] = arr3[arr3.length - 1];


        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
