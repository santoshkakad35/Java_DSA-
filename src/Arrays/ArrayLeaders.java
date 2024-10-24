package Arrays;

import java.util.*;

//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
public class ArrayLeaders {
    static void leaderArr(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        int max = arr[arr.length-1];
        nums.add(max);
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] >= max) {
                nums.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(nums);
        System.out.println(nums);
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leaderArr(arr);
    }
}
