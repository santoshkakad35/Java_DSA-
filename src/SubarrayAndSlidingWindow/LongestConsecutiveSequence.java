package SubarrayAndSlidingWindow;
import java.util.*;
public class LongestConsecutiveSequence {
    static void pbGFG1(int[] arr) {
        if(arr.length == 0 || arr == null) {
            return;
        }

        Arrays.sort(arr);
        int count = 1, max = 1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]==arr[i-1]) {
                continue;
            }

            if(arr[i]-arr[i-1] == 1) {
                count++;
            } else {
                max = Math.max(count,max);
                count=1;
            }

        }
        max = Math.max(count, max);
        System.out.println("Max consective sequence is : "+max);
    }
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        pbGFG1(arr);
    }
}
