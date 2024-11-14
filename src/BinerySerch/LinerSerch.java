package BinerySerch;

public class LinerSerch {
    static void check(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                System.out.print("Element fount at index : "+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,32,54,22,89};
        int target = 22;
        check(arr, target);
    }
}
