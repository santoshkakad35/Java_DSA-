package Recursion;

public class printPlaceOfTarget {
    static void check(int[] arr, int target, int idx) {
        if(idx >= arr.length) return;

        if(arr[idx] == target) {
            System.out.print(idx+" ");
        }

        check(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        check(arr, 2, 0);
    }
}
