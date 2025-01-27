package BinerySerch;
import java.util.Scanner;
public class ceiling {

    /*ceiling of a number*/
    static int ceilingOfNum(int[] arr, int target) {
        int st =0, end = arr.length-1;
        if (target > arr[end]) {
            return -1;
        }
        while(st <= end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(target > arr[mid]) {
                st = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return arr[st];
    }

    /*floor of number*/
    static int floorOfNum(int[] arr, int target) {
        int st =0, end = arr.length-1;
        if (target > arr[end]) {
            return -1;
        }
        while(st <= end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(target > arr[mid]) {
                st = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return arr[st];
    }

    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println("Ceiling of number : "+ ceilingOfNum(arr,target));
    }
}
