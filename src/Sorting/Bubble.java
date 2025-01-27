package Sorting;

public class Bubble {
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (flag != true) {
                return;
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,1,8};
        bubble(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
