package String;

import java.util.Scanner;

public class serchGivenWordInAStringOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I love Java & I love coding";
        String key = "love";

        String[] words = str.split("\\s");
        int count = 0;

        for (int i = 0; i < words.length-1; i++) {
            if (words[i].equalsIgnoreCase(key)) {
                System.out.println("Word '" + key + "' found at index: " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Word '" + key + "' not found in the string.");
        }
    }
}
