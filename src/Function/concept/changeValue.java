package Function.concept;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        // create an array

        int []a = {1,2,3,4,5};
        change(a);
        System.out.println(Arrays.toString(a));
    }

    static void change(int[] nums) {
        nums[0] = 99;
        // it change the original array or not ?
        // Yes it can change the original one also
        //

    }
}
