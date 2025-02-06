package String;
import java.math.BigInteger;
import java.util.*;
// https://www.geeksforgeeks.org/problems/multiply-two-strings/1?page=1&category=Strings&sortBy=submissions
public class MultiplyTwoStrings {
    static String gfgUAi8(String s1,String s2) {
        // Convert strings to BigInteger
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);

        // Multiply the numbers
        BigInteger result = num1.multiply(num2);

        // Convert result back to string
        return result.toString();
    }
    public static void main(String[] args) {
        String s1 = "0033";
        String s2 = "2";
        System.out.println(gfgUAi8(s1, s2));;
    }
}
