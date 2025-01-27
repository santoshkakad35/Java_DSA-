package CyclicSort;

//268. Missing Number
public class MissingElement {
    static int Leetcode268(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int idx = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[idx]) {
                swap(arr, i, idx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int st, int end) {
        int tmp = arr[st];
        arr[st] = arr[end];
        arr[end] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(Leetcode268(arr));;
    }
}
