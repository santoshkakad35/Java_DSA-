package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "madam";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
