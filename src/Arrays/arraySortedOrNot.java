package Arrays;

public class arraySortedOrNot {
    static void SortedArr(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2};
        SortedArr(arr);
    }
}
