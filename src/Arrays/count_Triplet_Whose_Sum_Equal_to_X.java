package Arrays;

import java.util.Scanner;

public class count_Triplet_Whose_Sum_Equal_to_X {
    static void checkInfo(int[] arr, int key) {
        int test = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        test++;
                    }
                }
            }

        }
        System.out.println("The triplet is " + test);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();

        checkInfo(arr, key);
    }
}
