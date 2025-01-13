package Sorting;
import java.util.*;
public class Count {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    static void BasicCountSort(int[] arr) {
        int max = findMax(arr); // we get maximum array from this
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;        // here we store the frequency of each array element
        }

        // we traversed on the count array and element having the frequency we iterate upto that one
        int k = 0;
        for(int i=0;i<count.length;i++) {
            for(int j=0;j<count[i];j++) {
                arr[k++] = i;
            }
        }
    }

    static void CountSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        int max = findMax(arr); // we get maximum array from this
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;        // here we store the frequency of each array element
        }

        // make prefix sum of count array

        for(int i=1;i<count.length;i++) {
            count[i] += count[i-1];
        }

        // traversed from the original array to maintain the stability
        for(int i=n-1;i>=0;i--) {
            int idx = count[arr[i]]-1;  // now we get the index from count pref sum and -1 because arr is 0 based
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // copy all element from output to original array

        for(int i=0;i<n;i++) {
            arr[i]  = output[i];
        }

    }
    static void print(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
//        BasicCountSort(arr);
        /* by using this method of Basic Count Sort
            we loss the stability
        */
        CountSort(arr);
        print(arr);
    }
}
