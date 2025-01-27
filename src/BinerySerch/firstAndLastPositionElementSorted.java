package BinerySerch;

import java.util.Arrays;
// Leetcode 34 first and last Position element
public class firstAndLastPositionElementSorted {
    static int[] Leetcode34(int[] arr, int tar) {
        int[] res  = new int[2];
        res[0] = firstElement(arr,tar);
        res[1] = lastElement(arr,tar);
        return res;
    }

    static int firstElement(int[] arr, int tar) {
        int st = 0, end = arr.length-1;
        int flag = 0;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == tar) {
                flag = mid;
                end = mid-1;
            }

            else if(arr[mid] < tar) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return flag;
    }

    static int lastElement(int[] arr, int tar) {
        int st = 0 ,end = arr.length-1;
        int flag = 0;
        while(st<=end) {
            int mid = st + (end-st)/2;
            if(arr[mid] == tar) {
                flag = mid;
                st = mid+1;
            }

            else if(arr[mid] > tar) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(Leetcode34(arr,target)));
    }
}
