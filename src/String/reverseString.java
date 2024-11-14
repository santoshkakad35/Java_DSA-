package String;
//https://www.geeksforgeeks.org/problems/reverse-a-string/1?page=1&category=Strings&difficulty=Basic,Easy,Medium&status=solved,attempted&sortBy=submissions
public class ReverseString {
    public static void rev(String st) {
        StringBuilder sb = new StringBuilder();
        char[] ch = st.toCharArray();

        for (int i = ch.length-1; i >= 0 ; i--) {
            sb.append(ch[i]);
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String st = "Geeks";
        rev(st);
    }
}
