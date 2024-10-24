package Arrays;

import java.util.*;
//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class firstNegativeIntegerWindowK {
    public static long[] printFirstNegativeInteger(long A[], int N, int K) {
        Queue<Long> que = new LinkedList<>(); // Using Queue to store negative numbers
        long[] res = new long[N - K + 1]; // Result array to store first negative numbers
        int i = 0, j = 0;

        while (j < N) {
            // Add negative numbers to the queue
            if (A[j] < 0) {
                que.add(A[j]);
            }

            // If window size is less than K
            if (j - i + 1 < K) {
                j++;
            }
            // When window size is exactly K
            else if (j - i + 1 == K) {
                // If the queue has negative numbers, add the front of the queue to the result
                if (!que.isEmpty()) {
                    res[i] = que.peek();
                } else {
                    // If there are no negative numbers in the current window
                    res[i] = 0;
                }

                // Slide the window
                if (!que.isEmpty() && que.peek() == A[i]) {
                    que.poll(); // Remove the element from the queue if it's leaving the window
                }
                i++;
                j++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        long[] A = {12, -1, -7, 8, -15, 30, 16, 28};
        int K = 3;
        System.out.println(Arrays.toString(printFirstNegativeInteger(A,A.length,K)));
    }
}
