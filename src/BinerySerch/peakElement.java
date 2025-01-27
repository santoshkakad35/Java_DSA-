package BinerySerch;

// 852 , 162 Leetcode
public class peakElement {
    static int Leetcode852(int[] arr) {
        int st = 0,end = arr.length-1;
        while(st<end) {
            int mid = st+(end-st)/2;
            if(arr[mid] > arr[mid+1]) {
                // you are the desc part of the array
                // this may be the ans , but look at the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are asc part of the array
                st = mid+1;
            }
            // in the end , start == end and pointing to the largest element
        }
        return arr[st]; // you can return either st or end both are pointing to the same
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println("The peak element : "+ Leetcode852(arr));
    }

}
