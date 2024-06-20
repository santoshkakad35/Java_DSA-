package Sorting;

public class Selection {
    static void selection(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int min = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            if(min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        selection(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
