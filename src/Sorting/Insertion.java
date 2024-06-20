package Sorting;

public class Insertion {
    static void Insertion(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 5, 9, 2};
        Insertion(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
