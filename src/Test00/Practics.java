package Test00;

import java.util.*;
public class Practics {
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
    static void merge(int[] arr, int st, int mid,int end) {
        int n1 = mid-st+1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++) {
            left[i] = arr[st+i];
        }

        for(int j=0;j<n2;j++) {
            right[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=st;
        while(i<n1 && j<n2) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1) {
            arr[k++] = left[i++];
        }
        while(j<n2) {
            arr[k++] = right[j++];
        }
    }
    static void mergeSort(int[] arr, int x , int y) {
        if(x>=y) {      // base condition
            return;
        }
        int mid = (x + y) / 2;
        mergeSort(arr,x,mid);
        mergeSort(arr,mid+1,y);
        merge(arr,x,mid,y);
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
        Scanner sv = new Scanner(System.in);
//        int[] arr = {4, 7, 20, 2, 8, 11};
        int[] arr = {7,13,8,5,10,2,4};
        int n = arr.length;

//        mergeSort(arr,0, n-1);
        quickSort(arr, 0, n - 1);
        print(arr);
    }
}