package Sorting;

public class Quick
{
    static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
    static int partition(int[] arr, int st,int end) {
        int pivot = arr[st];
        int count = 0;
        for(int i=st+1;i<=end;i++) {
            if(arr[i]<= pivot) { // less then equal to for dublicate element
                count++;
            }
        }

        int pivotIndx = st + count;
        swap(arr,st,pivotIndx);     // we place our pivotIndex

        int i = st, j = end;
        while(i<pivotIndx && j>pivotIndx){
            while(arr[i] <= pivot) {    // we placed the dublicate element on left side
                i++;
            }
            while(arr[j]>pivot) {
                j--;
            }

            if(i<pivotIndx && j>pivotIndx) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndx;
    }
    static void quickSort(int[]arr, int st, int end) {
        if(st>=end) {
            return;
        }
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
//        print(arr);
    }
    static void print(int[] arr) {
        for(int val : arr) {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr,0,n-1);

        print(arr);
    }
}
