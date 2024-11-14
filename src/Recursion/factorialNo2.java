package Recursion;

import java.util.ArrayList;

//Find all factorial numbers less than or equal to n
public class factorialNo2 {
    static void fact(int n) {
        ArrayList<Long> arr = new ArrayList<>();
        long fact = 1;
        int i = 1;
        while (fact <= n) {
            arr.add(fact);
            i++;
            fact*=i;
        }

        System.out.println(arr);;
    }
    public static void main(String[] args) {
        int n = 4;
        fact(n);
    }
}
