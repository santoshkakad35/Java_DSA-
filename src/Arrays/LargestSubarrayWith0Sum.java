package Arrays;

import java.util.*;
//https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category[]=Hash&company[]=Amazon&page=1&query=category[]Hashcompany[]Amazonpage1company[]Amazoncategory[]Hash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum
public class LargestSubarrayWith0Sum {
    public static int maxLen(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == 0) {
                maxLen = i + 1;
            }

            if(mp.containsKey(sum)) {
                int len = i - mp.get(sum);
                maxLen = Math.max(maxLen,len);
            } else{
                mp.put(sum,i);
            }


        }
        return  maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr));;
    }
}
