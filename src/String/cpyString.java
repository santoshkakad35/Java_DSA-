package String;

public class cpyString {
    public static void main(String[] args) {
        String originalString = "Hello, world!";

        // By use of string builder
//        String copiedString = new String(originalString);
//        System.out.println("Copied string: " + copiedString);

        String original = "Hello, world!";
        String c1 = String.valueOf(original);
        String c2 = String.copyValueOf(original.toCharArray());

        System.out.println(original); // Output: Hello, world!
        System.out.println(c1.concat("world"));   // Output: Hello, world!
        System.out.println(c2);   // Output: Hello, world!
    }
}
