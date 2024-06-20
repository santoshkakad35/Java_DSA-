package Arrays;

import java.util.Scanner;

public class Count_Maximum_Consecutive_Ones_in_the_array {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }

        System.out.println("Consecutive One's in the array " + count);

    }
}
