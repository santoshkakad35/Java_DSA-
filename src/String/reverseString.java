package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I love Java code";
        String[] str2 = str.split(" ");
        for(int i=str2.length-1;i>=0;i--) {
            System.out.print(str2[i]+" ");
        }


        /*
        String str = "hello";
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i)+" ");
        }

        */
    }
}
