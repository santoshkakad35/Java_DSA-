package Arrays;

import java.util.Scanner;

public class missing_Number_in_array {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }

        int actualSum = (arr.length*(arr.length+1))/2;

        int MissingNo = actualSum - ans;

        System.out.println(MissingNo);

    }
}
