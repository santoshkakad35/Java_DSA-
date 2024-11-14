package String;
//https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&category=Strings&status=solved,attempted&sortBy=submissions
public class reverseWord {
    public static void main(String[] args) {
        String str = "i.love.code";
        String[] words = str.split("\\.");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(".");
            }
        }


        System.out.println(reversed.toString());
    }
}
