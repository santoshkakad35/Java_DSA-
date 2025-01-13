package Arrays;

import java.util.HashMap;

// 387 First Unique Character in String
public class FirstUniqueCharacter {
    static int uniqueCharacter(String s1) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            char ch = s1.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s1.length(); i++) {
            if(mp.get(s1.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "loveleetcode";
        System.out.println(uniqueCharacter(s1));;
    }
}
