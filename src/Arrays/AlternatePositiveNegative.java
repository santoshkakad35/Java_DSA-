package Arrays;

import java.util.Arrays;
// 2149 Rearrage the elements by Sign
public class AlternatePositiveNegative {
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int odd = 1;   // Pointer for placing negative numbers (odd indices)
        int even = 0;  // Pointer for placing positive numbers (even indices)

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[odd] = nums[i];
                odd += 2;  // Move to the next odd index
            } else {
                result[even] = nums[i];
                even += 2;  // Move to the next even index
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
