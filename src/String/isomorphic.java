package String;

import java.util.HashMap;

public class isomorphic {

    static boolean isIsomorphic(String st1, String st2) {
        if(st1.length() != st2.length()) {
            return false;
        }

        HashMap<Character,Character> mp1 = new HashMap<>();
        HashMap<Character,Character> mp2 = new HashMap<>();

        for (int i = 0; i < st1.length(); i++) {
            char ch1 = st1.charAt(i);
            char ch2 = st2.charAt(i);

            if(mp1.containsKey(ch1)) {
                if(mp1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                mp1.put(ch1,ch2);
            }

            if(mp2.containsKey(ch2)) {
                if(mp2.get(ch2) != ch1) {
                    return false;
                }
            } else {
                mp2.put(ch2,ch1);
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String st1 ="egg";
        String st2 = "add";
        System.out.println(isIsomorphic(st1,st2));
    }
}
