package String;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    static boolean patternfollow(String pattern, String s) {
        if(pattern.length() != s.length()) {
            return  false;
        }
        HashMap<Character,String> mp = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char ch = pattern.charAt(i);
            if(mp.containsKey(ch)) {
                if(!mp.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if(set.contains(word)) {
                    return false;
                } else {
                    mp.put(ch,word);
                    set.add(word);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(patternfollow(pattern, s));;
    }
}
