package SubarrayAndSlidingWindow;

import java.util.*;
//https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1?page=1&category=sliding-window&sortBy=submissions

public class CountDistinctElementsInEveryWindow {
    static ArrayList<Integer> gfgKQ2n(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        int i = 0, j = 0, n = arr.length;
        while (j < n) {
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);


            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                num.add(mp.size());

                mp.put(arr[i], mp.get(arr[i]) - 1);
                if (mp.get(arr[i]) == 0) {
                    mp.remove(arr[i]);
                }
                i++;
                j++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(gfgKQ2n(arr, k));
    }

}
