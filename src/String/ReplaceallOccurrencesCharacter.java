package String;

public class ReplaceallOccurrencesCharacter {
    public static void main(String[] args) {
        String str = "I_love_coding_i_love_java";
        String replace = null;
        for (int i = 0; i < str.length(); i++) {
            replace = str.replace('_', '-');
        }

        System.out.print(replace);
    }
}
