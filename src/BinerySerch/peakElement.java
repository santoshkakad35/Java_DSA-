package BinerySerch;

public class peakElement {
    static int find(int[] arr) {
        int st = 0, end = arr.length-1;
        while(st< end) {
            int mid = st+(end-st)/2;
            if(arr[mid] < arr[mid+1]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(find(arr));
    }
}
