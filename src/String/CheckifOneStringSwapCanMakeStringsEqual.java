package String;
import java.util.*;
// Leetcode 1790
public class CheckifOneStringSwapCanMakeStringsEqual {
    static boolean Leetcode1790(String st1 , String st2) {
        if(st1 == null || st2 == null) {
            return false;
        }

        if(st1.length() != st2.length()) return false;

        int diff = 0;
        int first = -1, second = -1;
        for(int i=0;i<st1.length();i++) {
            if(st1.charAt(i) != st2.charAt(i)) {
                diff++;
                if(diff == 1) {
                    first = i;
                } else if (diff == 2) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        if(diff == 0)return true;
        return diff == 2 && st1.charAt(first) == st2.charAt(second) && st2.charAt(first) == st1.charAt(second);
    }
    public static void main(String[] args) {
        String str1 = "attack";
        String str2 = "defend";
        System.out.println(Leetcode1790(str1,str2));;
    }
}
