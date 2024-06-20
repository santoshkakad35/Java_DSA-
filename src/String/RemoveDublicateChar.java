package String;

public class RemoveDublicateChar {
    static StringBuilder dublicate(String str){
        StringBuilder str2 = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char currentElement = str.charAt(i);
            boolean unique = true;
            for(int j=i+1;j<str.length();j++) {
                if(currentElement == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if(unique) {
                str2.append(currentElement);
            }
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = "Codeforwin";
        StringBuilder uniqueString = dublicate(str);
        System.out.println(uniqueString);
    }
}
