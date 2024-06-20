package Arrays;

public class maxSubarraySum {
    static void check(int[] arr) {
        int sum;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = st; k <= end; k++) {
                    sum += arr[k];
//                    System.out.print(arr[k]+" ");
                }
                if(max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum subarray " + max);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        check(arr);
//        for(int i:arr) {
//            System.out.print(i+" ");
//        }
    }
}
