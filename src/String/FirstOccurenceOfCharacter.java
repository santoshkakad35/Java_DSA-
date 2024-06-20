package String;

public class FirstOccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "I love coding";
        char ch = 'o';
        for(int i=0;i<str.length();i++) {
            if(ch == str.charAt(i)) {
                System.out.print("First Occurence of character : " +i);
                break;
            }
        }
    }
}
