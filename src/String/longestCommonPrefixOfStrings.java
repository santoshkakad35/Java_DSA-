package String;
//Given an array of strings arr.
// Return the longest common prefix among each and every strings present in the array.
// If there's no prefix common in all the strings, return "-1".
public class longestCommonPrefixOfStrings {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        check(arr);
    }

    public static void check(String arr[]) {
        String res = arr[0];

        for(int i=1;i<arr.length;i++) {
            res = common(res,arr[i]);
        }

        System.out.println("Longest Common Prefix of Strings : "+res);
    }

    public static String common(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            }
            else {
                break;
            }
        }

        return sb.toString();
    }
}
