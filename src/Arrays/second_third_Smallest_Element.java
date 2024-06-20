package Arrays;

public class second_third_Smallest_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        int m3 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m1) {
                m2 = m1;
                m3 = m2;
                m1 = arr[i];
            } else if (arr[i] < m2 && arr[i] != m1) {
                m3 = m2;
                m2 = arr[i];
            } else if (arr[i] < m3 && arr[i] != m2) {
                m3 = arr[i];
            }

        }
        System.out.print("Second smallest " + m3);
    }
}
