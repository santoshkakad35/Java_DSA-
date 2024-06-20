package Recursion;
// print the array
public class printArray {
    static void print(int[] arr, int idx) {
        if(idx == arr.length) return;

        System.out.println(arr[idx]);

        print(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        print(arr,0);
    }
}
