package String;

public class LastOccurrence {
    public static void main(String[] args) {
        String str = "I love coding";
        char ch = 'o';
        int index = -1;
        for(int i=0;i<str.length();i++) {
            if(ch == str.charAt(i)) {
                index = i;
            }
        }
        System.out.println("Last Occurrence : "+index);
    }
}
