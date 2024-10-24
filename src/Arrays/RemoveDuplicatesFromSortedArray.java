package Arrays;
// 26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray {
    static void removeDublicate(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[k++] = arr[i];
            }
        }
        System.out.println(k+" dublicate elements");;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        removeDublicate(arr);
    }
}
