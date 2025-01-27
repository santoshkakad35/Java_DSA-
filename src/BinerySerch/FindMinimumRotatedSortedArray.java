package BinerySerch;
import java.util.*;
// Leetcode 153
public class FindMinimumRotatedSortedArray {
    static int Leetcode153(int[] arr) {
        int st =0 ,end = arr.length-1;
        while(st<end) {
            int mid = st+(end-st)/2;
            if(arr[mid] > arr[end]) {
                st=mid+1;
            } else {
                end=mid;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println( Leetcode153(arr));
    }
}
