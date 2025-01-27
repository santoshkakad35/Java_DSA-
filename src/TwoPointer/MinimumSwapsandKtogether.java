package TwoPointer;

import java.util.*;

//https://www.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1?page=1&category=prefix-sum&status=solved,unsolved,attempted&sortBy=submissions
public class MinimumSwapsandKtogether {

    static int gfgQW8n(int[] arr, int k) {
        int count = 0;
        int st = 0, end = arr.length-1;
        while(st<end) {
            if(arr[st] <= k) {
                st++;
            }
            else if(arr[end] > k) {
                end--;
            }
            else {
                swap(arr[st],arr[end]);
                count++;
                st++;
                end--;
            }
        }
        return count;
    }

    static void swap(int st, int end) {
        int temp = st;
        st = end;
        end = temp;
    }
    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 6, 3};
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k = 6;
        System.out.println("the number swaps done : "+gfgQW8n(arr,k));;
    }
}
