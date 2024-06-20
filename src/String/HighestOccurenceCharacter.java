package String;

public class HighestOccurenceCharacter {
    public static void main(String[] args) {
        String str = "I love code codeforwin";
        String ans = "";
        for(int i=0;i<str.length();i++) {
            for(int j=i+1;j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    ans = String.valueOf(str.charAt(i));
                }
            }
        }

        System.out.println(ans);
    }
}
