package Arrays;

public class identifyPlaceOfKeyElement {
    static void check(int[] arr) {
        int key = 88;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                ans = i;
                break;
            }
        }

        System.out.println("The place of the array : " + ans);
    }

    public static void main(String[] args) {
        int[] arr = {12, 33, 88, 90, 77, 88, 4, 88};
        check(arr);
    }
}
