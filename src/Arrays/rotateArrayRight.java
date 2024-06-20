package Arrays;

public class rotateArrayRight {
    static void swap(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        swap(arr, 0, n - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, n - 1);

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        rotate(arr, k);
//        printArr(arr);

    }
}
