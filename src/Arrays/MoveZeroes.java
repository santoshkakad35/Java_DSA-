package Arrays;

import java.util.Arrays;
//283. Move Zeroes
public class MoveZeroes {
    static void moveElement(int[]arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }

        for (int j = k; j < arr.length; j++) {
            arr[k++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveElement(arr);
    }
}
