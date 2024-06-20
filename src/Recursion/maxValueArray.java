package Recursion;

import java.util.Scanner;

// max element in array
public class maxValueArray {
    static int print(int[] arr, int idx) {
        if(idx == arr.length-1) {
            return arr[idx];
        }

        int small = print(arr, idx+1); // idx+1 to n -> give max value
        return Math.max(arr[idx] , small);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,3};
        System.out.println(print(arr,0));
    }
}
