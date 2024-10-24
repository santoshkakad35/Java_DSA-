package Arrays;
import java.util.*;

public class WordPattern {
    static boolean wordPatten(String pattern,String s) {
        HashMap<Character,String> mp = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] str = s.split(" ");

        if(pattern.length() != str.length) {
            return false;
        }

        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            char ch = pattern.charAt(i);

            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if(set.contains(ch)) {
                    return false;
                } else {
                    set.add(word);
                    mp.put(ch,word);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";

        System.out.println(wordPatten(pattern, s));;
    }
}
