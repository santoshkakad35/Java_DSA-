package Arrays;

public class cloningOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = arr.clone();

        System.out.println("cloning of array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("after changing element of arrays");
        arr2[0] = 0;
        arr2[1] = 0;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
