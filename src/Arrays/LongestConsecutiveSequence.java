package Arrays;
import java.util.*;
public class LongestConsecutiveSequence {
    static int longestSeq(int[] arr) {
        if(arr.length == 0 || arr == null) {
            return 0;
        }
        Arrays.sort(arr);
        int max= 1, count=1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] == arr[i-1]) {
                continue;
            }

            if(arr[i] - arr[i-1] == 1) {
                count++;
            } else {
                count=1;
            }

            max = Math.max(count,max);
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestSeq(arr));;
    }
}
