package Sorting;

public class Quick
{
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }

    static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivInd = partition(arr, low,high);
            quickSort(arr, low, pivInd - 1);
            quickSort(arr,pivInd+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr,0,n-1);

        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
