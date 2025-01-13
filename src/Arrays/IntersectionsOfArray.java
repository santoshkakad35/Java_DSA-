package Arrays;

import java.util.Arrays;
import java.util.HashSet;

// 349 Intersections of Arrays
public class IntersectionsOfArray {
    static void intersection(int[] n1, int[] n2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : n1) {
            set1.add(num);
        }

        for(int num:n2) {
            if(set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] res = new int[set2.size()];
        int i = 0;
        for(int num : set2) {
            res[i++] = num;
        }

        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] n1 = {4,9,5};
        int[] n2 = {9,4,9,8,4};
        intersection(n1, n2);
    }
}
