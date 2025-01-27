package Sorting;
import java.util.*;
public class Bucket {
    static float findMax(float[] arr) {
        float max = Integer.MIN_VALUE;
        for(float num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
    static ArrayList<Float> bucketSort(float[] arr) {
        if(arr.length == 0) {
            return new ArrayList<>();
        }
        // find the bucket size
        float maxElement = findMax(arr);
        int maxIndx = (int)(maxElement*arr.length);
        int bucketSize = maxIndx+1;

        // initialize the buckets list
        ArrayList<Float> bucket[] = new ArrayList[bucketSize];
        for(int i=0;i<bucketSize;i++) {
            bucket[i] = new ArrayList<>();
        }

        //insert an element into the bucket
        for(int i=0;i<arr.length;i++) {
            /*int idx = (int)(arr[i]*arr.length);
            bucket[idx].add(arr[i]);*/

            int idx = (int)(arr[i]*arr.length);
            int target = 0;
            while(target<bucket[idx].size() && arr[i] > bucket[idx].get(target)) {
                target++;
            }
            bucket[idx].add(target,arr[i]);
        }

        //sort the buckets individually
        /*for(int i=0;i<bucketSize;i++) {
            Collections.sort(bucket[i]);
        }*/

        // store the element into the result list
        ArrayList<Float> num = new ArrayList<>();
        for(int i=0;i<bucketSize;i++) {
            for(Float element : bucket[i]) {
                num.add(element);
            }
        }
        return num;
    }

    static void print(float[] arr) {
        for(float num : arr) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        ArrayList<Float> res = bucketSort(arr);
        System.out.println(res);
    }
}
