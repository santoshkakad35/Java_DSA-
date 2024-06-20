package Arrays;

import java.util.Scanner;

public class totalNo_Of_Pair_Whose_Sum_Equal_Value_Of_X {
    static int checkInfo(int[] arr, int key) {
        int test = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    test++;
                }
            }
        }
        return test;
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

        int result = checkInfo(arr, key);
        System.out.println("The sum of the pair : " + result);
    }
}
