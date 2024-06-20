package String;

public class vowelsConsonantsInString {
    public static void main(String[] args) {
        String str = "I love java";
        StringBuilder sb = new StringBuilder();
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                c1++;
            } else {
                c2++;
            }
        }

        System.out.println("Vowels "+c1);
        System.out.println("Consonants "+c2);
    }
}
