package Test00;

import java.util.*;

public class Practise {
    static String pb(String str) {
        int i = str.length()-1;
        while(i>=0) {
            if((int) str.charAt(str.length()-1)%2==1) return str;
            int n = str.charAt(i);
            if(n%2==1) {
               return str.substring(0,i+1);
            } else {
                i--;
            }
        }
        return " ";
    }
    static String pb1(String[] str) {
        String check = str[0];
        for (int i = 1; i < str.length; i++) {
            check = commonPref(check , str[i]);
            if(check.isEmpty()) {
                return "";
            }
        }
        return check.toString();
    }
    static boolean pb2(String s1,String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            mp1.put(ch, mp1.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            mp2.put(ch, mp2.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : mp1.entrySet()) {
            if (!mp1.get(entry.getKey()).equals(mp2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }



    static String commonPref(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
//        String str = "47283922";
//        System.out.println(pb(str));;
//        String[] str = {"flower", "flow", "flight"};
//        System.out.println(pb1(str));;
        String s1 = "egg";
        String s2 = "add";
        System.out.println( pb2(s1,s2));;
    }
}