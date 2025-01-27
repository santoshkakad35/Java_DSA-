package BinerySerch;
import java.util.*;
// https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1
public class ceilAndFloor {
    static int[] checkCeilAndFloor(int[] arr,int x) {
        int st = 0,end = arr.length-1;
        int[] res = new int[2];
        int floor = -1, ceil = -1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if(mid == x) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            if(x > arr[mid]) {
                floor = arr[mid];
                st = mid + 1;
            } else {
                ceil = arr[mid];
                end = mid - 1;
            }
        }

        res[0] = floor;
        res[1] = ceil;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,8,9,6,5,5,6};
        int x = 7;
        System.out.println(Arrays.toString(checkCeilAndFloor(arr,x)));
    }
}
