package Arrays;

public class countPerticulerElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,5};
        int key = 2;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key) {
                count++;
            }
        }

        System.out.println("Element is repeat "+count);
    }
}
