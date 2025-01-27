package BinerySerch;
import java.util.*;
// Leetcode 81
public class RotationElement2 {
    static boolean Leetcode81(int[] arr,int target) {
        int st = 0,end = arr.length-1;
        while(st<=end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target) {
                return true;
            }
            if(arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
                continue;
            }
            else if(arr[st] <= arr[mid]) {
                if(target >= arr[st] && target < arr[mid]) {
                    end= mid-1;
                } else {
                    st = mid+1;
                }
            } else {
                if(target > arr[mid] && target <= arr[end]) {
                    st = mid+1;
                } else {
                    end= mid-1;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(Leetcode81(arr,target));
    }
}
