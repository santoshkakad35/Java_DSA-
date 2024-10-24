package Arrays;
// 485 Max Consecutive of onces
public class MaxConsecutiveOnes {
    static void consecutiveOnce(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] a = {1,0,1,1,0,1};
        consecutiveOnce(a);
    }
}


