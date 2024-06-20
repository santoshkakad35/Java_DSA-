package String;

public class compareTwoString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal (case-sensitive)");
        } else {
            System.out.println("Strings are not equal (case-sensitive)");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (case-insensitive)");
        } else {
            System.out.println("Strings are not equal (case-insensitive)");
        }

        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("Strings are equal (lexicographically)");
        } else if (comparisonResult < 0) {
            System.out.println("str1 comes before str2 (lexicographically)");
        } else {
            System.out.println("str1 comes after str2 (lexicographically)");
        }
    }
}
