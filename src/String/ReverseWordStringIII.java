package String;
// 557 Reverse word string III
public class ReverseWordStringIII {

    static void reverseWord(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word :words) {
            sb.append(rev(word)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    static String rev(String str) {
        char[] ch = str.toCharArray();
        int st = 0, end = ch.length-1;
        while(st<end) {
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "i love coding";
        reverseWord(str);
    }
}
