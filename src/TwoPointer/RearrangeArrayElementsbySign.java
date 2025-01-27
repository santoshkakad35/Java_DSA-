package TwoPointer;

import java.util.*;

// Leetcode 2149
public class RearrangeArrayElementsbySign {
    static int[] Leetcode2149(int[] arr) {
        int[] res = new int[arr.length];
        int pos = 0 , neg = 1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > 0) {
                res[pos] = arr[i];
                pos = pos + 2;
            } else {
                res[neg] = arr[i];
                neg=neg+2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(Leetcode2149(arr)));;
    }
}
