package String;

public class toggleCharacterofString {
    public static void main(String[] args) {
        String str = "Hello java Coding";
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            }
            else {
                sb.append(ch); // for space
            }
        }
        System.out.println(sb);
    }
}
