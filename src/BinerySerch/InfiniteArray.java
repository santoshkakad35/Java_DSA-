package BinerySerch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,120,150,180};
        int target = 10;
        System.out.println(ans(arr,target));
    }

     static int ans(int[] arr ,int target) {
        int st = 0;
        int ed = 1;
        while (target > arr[ed]) {
            int temp = ed  + 1;
            // double the box;
            // end = previous end + size of box * 2
            ed = ed + (ed - st + 1) * 2;
            st = temp;
        }
        return Binery(arr,target,st,ed);
    }

    static int Binery(int[] arr,int target,int st, int end) {

        while(st <= end) {
            int mid = st + (end- st) / 2;
            if(target == arr[mid]) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;

    }

}
