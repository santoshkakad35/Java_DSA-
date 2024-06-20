package String;

import java.util.Scanner;

public class serchGivenCharacterPositionOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I love programming. I love Codeforwin.";
        char key = 'o';
        for(int i=0;i<str.length()-1;i++) {
            if(str.charAt(i) == key) {
                System.out.println("'o' at index "+i);
            }
        }
    }
}
