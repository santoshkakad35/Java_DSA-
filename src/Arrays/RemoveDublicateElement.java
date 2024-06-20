package Arrays;

import java.util.Arrays;

public class RemoveDublicateElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 1, 2, 4, 5, 6, 7, 5, 1};
        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

