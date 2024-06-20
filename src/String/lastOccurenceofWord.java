package String;

public class lastOccurenceofWord {
    public static void main(String[] args) {
        String str = "I love Code I love java.";
        String[] str2 = str.split("\\s");
        String key = "love";
        int pos = 0;
        for (int i = 0; i < str2.length; i++) {
            if (str2[i].equals(key)) {
                pos = i;
            }

        }
        System.out.println(pos);

    }
}
