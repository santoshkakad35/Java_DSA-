package Arrays;

public class kadances {
    static int check(int[] a) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            sum = sum + a[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }


        return maxi;
    }
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The max subArray is : " +check(a));
    }
}
