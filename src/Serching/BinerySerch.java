package Serching;

public class BinerySerch {
    static boolean Binery(int[] arr, int target) {
        int st = 0;
        int end = arr.length-1;
        while(st <= end) {
            int mid = st + (end- st) / 2;
            if(target == arr[mid]) {
                return true;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,15,20,25,45,60,77};
        int target = 60;
//        Binery(arr, target);
        System.out.println(Binery(arr, target));
    }
}
