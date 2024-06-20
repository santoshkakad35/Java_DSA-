package String;

public class CountNumberWords {
    public static void main(String[] args) {
        String str = "I love coding";
        String[] str2 = str.trim().split("\\s+");
        System.out.println(str2.length);
    }
}
