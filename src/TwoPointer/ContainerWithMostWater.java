package TwoPointer;

// Leetcode 11
public class ContainerWithMostWater {
    static int Leetcode11(int[] arr) {
        int max = Integer.MIN_VALUE, area = 0;
        int st = 0,end = arr.length-1;
        while(st<end) {
            if(arr[st]>=arr[end]) {
                area = ((end-st) * Math.min(arr[st],arr[end]));
                end--;
            } else {
                area = ((end-st) * Math.min(arr[st],arr[end]));
                st++;
            }
            max = Math.max(area,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(Leetcode11(arr));;
    }
}
