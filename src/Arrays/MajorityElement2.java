package Arrays;
import java.util.*;
//229 Majority Element2
public class MajorityElement2 {
    static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Find elements that appear more than n/3 times
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                arr.add(entry.getKey());
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));;
    }
}
