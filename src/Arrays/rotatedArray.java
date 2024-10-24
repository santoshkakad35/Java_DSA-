package Arrays;

import java.util.Arrays;
// right rotate array
//  189. Rotate Array
public class rotatedArray {
    static void rotate(int[] arr, int  k) {
        k %= arr.length;
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]arr , int st, int end) {
        while(st<end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr,k);
    }
}
