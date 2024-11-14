package BinerySerch;

public class findMountainArray {
    public static int find(int[] arr, int target) {
        int peak = peakElement(arr);
        int result = first(arr,target,0,peak);
        if(result!=-1) {
            return result;
        }

        return second(arr,target,peak+1,arr.length-1);
    }

    public static int peakElement(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }

    public static int first(int[]arr, int target, int st, int end) {
        while(st<=end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target) {
                end = mid-1;
            } else {
                st=mid+1;
            }
        }

        return -1;
    }

    public static int second(int[]arr, int target, int st, int end) {
        while(st<=end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target) {
                st=mid-1;
            } else {
                end=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(find(arr, target));
    }
}
