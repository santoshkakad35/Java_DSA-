package Arrays;

public class printSubArr {
    static void check(int[] arr) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = st; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("ts " + ts);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        check(arr);
//        for(int i:arr) {
//            System.out.print(i+" ");
//        }
    }
}
