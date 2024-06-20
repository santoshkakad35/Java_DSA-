package Recursion;

public class targetElementofArray{
    static boolean print(int[] arr, int key , int idx) {
        if(idx >= arr.length) {     // base work
            return false;
        }

        if(arr[idx] == key) return true;    // self work

        if(print(arr, key,idx+1)) {     // recursive work
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 3;
        print(arr, key , 0);

        if(true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
