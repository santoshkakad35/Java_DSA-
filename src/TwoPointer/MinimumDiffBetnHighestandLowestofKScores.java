package TwoPointer;
import java.util.*;

// leetcode 1984
public class MinimumDiffBetnHighestandLowestofKScores {
    static int Leetcode1984(int[] arr,int k) {
        if(k== 0) return 0;
        Arrays.sort(arr);
        int diff = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-k;i++) {
            diff = arr[i+k-1] - arr[i];
            min = Math.min(diff,min);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7};
        int k = 2;
        System.out.println(Leetcode1984(arr,k));
    }
}
