package Arrays;

import java.util.Scanner;

public class insert_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array element");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int element = 25;
        int pos = 2;

        for (int i = 5; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
