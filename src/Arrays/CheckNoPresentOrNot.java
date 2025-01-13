package Arrays;

import java.util.Scanner;

public class CheckNoPresentOrNot {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int[] arr = {5,6,5,400,560,100,400};

        int[] FreqArr = new int[1000];

        for (int i=0;i< arr.length;i++) {
            FreqArr[arr[i]]++;
        }

        System.out.println("Enter the queries ...");
        int q = sv.nextInt();

        while(q>0) {
            int x = sv.nextInt();
            if (FreqArr[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            q--;
        }
    }
}
