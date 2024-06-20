package Recursion;
// sum of array
public class sumofArray {
    static int print(int[] arr, int idx) {
//        if(idx == arr.length-1) {
//            return arr[idx];
//        }

        if(idx == arr.length) return 0; // base case

        int small = print(arr, idx+1);  // recursive work
        return (arr[idx]+small);    // self work
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(print(arr,0));
    }
}
