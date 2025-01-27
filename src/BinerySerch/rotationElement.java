package BinerySerch;
// Leetcode 33
public class rotationElement {
    static int Leetcode33(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the target is found at mid
            if (arr[mid] == target) {
                return mid;
            }

            // Check if the right half is sorted
            if (arr[mid] <= arr[end]) {
                // If target lies in the sorted right half
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Otherwise, the left half is sorted
            else {
                // If target lies in the sorted left half
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // Target not found
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(Leetcode33(arr,target));
    }
}
