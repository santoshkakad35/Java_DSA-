package Recursion;

public class printArrRecursive {
    static void printArrRec(int[] arr, int idz) {
        if(idz == arr.length) {
            return;
        }

        System.out.print(arr[idz]+" ");
        printArrRec(arr,idz+1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4};
        int idz = 0;
        printArrRec(arr, idz);
    }
}
