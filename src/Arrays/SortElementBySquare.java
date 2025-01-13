package Arrays;

import java.util.Arrays;

public class SortElementBySquare {
    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
        int[] num = new int[arr.length];
        int k = 0;
        int i = 0, j= arr.length-1;
        while(i <= j) {
            if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                num[k++] = (arr[i]* arr[i]);
                i++;
            }

            else  {
                num[k++] = (arr[j]* arr[j]);
                j--;
            }
        }

        Arrays.sort(num);


        System.out.println(Arrays.toString(num));
    }
}
