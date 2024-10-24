package Arrays;
//1752. Check if Array Is Sorted and Rotated
public class ArrayIsSortedAndRotated {
    static boolean checkSorted(int[] arr) {
        int count = 0;
        if (arr[0] < arr[arr.length - 1]) {
            count++;
        }

        for(int i=1;i<arr.length;i++) {
            if(arr[i] < arr[i-1]) {
                count++;

                if(count>1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(checkSorted(arr));;
    }
}
