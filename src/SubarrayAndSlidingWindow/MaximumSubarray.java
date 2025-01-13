package SubarrayAndSlidingWindow;
// 53. Maximum Subarray Leetcode
public class MaximumSubarray {
    static int MaxSubArr(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            sum+= arr[i];
            max = Math.max(sum,max);
            if(sum<0) {
                sum = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray : "+MaxSubArr(arr));;
    }
}
