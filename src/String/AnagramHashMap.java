package String;

import java.util.HashMap;

public class AnagramHashMap {

    static HashMap<Character,Integer> anagramFreq(String str) {
        HashMap<Character,Integer> mp  = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            mp.put(str.charAt(i) , mp.getOrDefault(str.charAt(i) , 0) + 1);
        }
        return mp;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character,Integer> mp1 = anagramFreq(s);
        HashMap<Character, Integer> mp2 = anagramFreq(t);
        if(mp1.equals(mp2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
