package Arrays;

public class Kadanes {
    static void maxSumSubArr(int[] arr) {
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>max) {
                max = sum;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        System.out.println(max+" ");
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSumSubArr(arr);
    }
}
