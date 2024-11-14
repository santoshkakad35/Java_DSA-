package String;

public class Anagram {
    public static void main(String[] args) {
        String st1 = "geeksforgeeks";
        String st2 = "forgeeksgeeks";
        System.out.println(anagramOfEach(st1, st2));
    }

    static boolean anagramOfEach(String st1, String st2) {
        if(st1.length() != st2.length()) {
            return false;
        } else {
            int[] count = new int[26];
            for (int i = 0; i < st1.length(); i++) {
                count[st1.charAt(i) - 'a']++;
            }

            for(int i=0;i<st2.length();i++) {
                count[st2.charAt(i) - 'a']--;
            }


            for (int i = 0; i < count.length; i++) {
                if(count[i] != 0) {
                    return false;
                }
            }

            return true;
        }


    }
}
