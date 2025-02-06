package TwoPointer;
import java.util.*;
// Leetcode 881
public class BoatsToSavePeople {
    static int Leetcode881(int[] arr,int limit) {
        int st = 0,end = arr.length-1;
        Arrays.sort(arr);
        int count=0,sum = 0;
        while(st<=end) {
            sum = arr[st] + arr[end];
            if(sum<= limit) {
                count++;
                st++;
                end--;
            } else {
                end--;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 1};
        int limit  = 3;
        System.out.println(Leetcode881(arr,limit));;
    }
}
