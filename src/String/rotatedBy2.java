package String;

public class rotatedBy2 {

    public static boolean isRotated(String str1, String str2) {
        int n = str1.length();

        // Check if lengths are different
        if (n != str2.length()) return false;

        // Handle edge cases for strings with length less than 2
        if (n < 2) return str1.equals(str2);

        // Check for left rotation by 2
        String leftRotated = str1.substring(2) + str1.substring(0, 2);
        // Check for right rotation by 2
        String rightRotated = str1.substring(n - 2) + str1.substring(0, n - 2);

        // Compare with b
        return str2.equals(leftRotated) || str2.equals(rightRotated);
    }

    public static void main(String[] args) {
        String arr1 = "amazon";
        String arr2 = "azonam";
        System.out.println(isRotated(arr1,arr2));;
    }


}
