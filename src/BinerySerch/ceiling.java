package BinerySerch;
// same for floor number
public class ceiling {

    static int pb(int[] arr, int target) {
        int st = 0, end = arr.length-1;
        while(st < end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(target > arr[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,14,16,18};
        int target = 15;
        System.out.println(pb(arr,target));
    }
}
