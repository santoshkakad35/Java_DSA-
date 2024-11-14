package String;

import java.util.*;

public class PrintKeyValuesSorted {
    public static void main(String[] args) {
        // Initialize the map
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('e', 2);
        map.put('a', 3);
        map.put('b', 1);

        // Convert the map to a list of entries
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the entries by value in descending order
        entryList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        // Loop through the sorted entries and print the key 'value' times
        for (Map.Entry<Character, Integer> entry : entryList) {
            char key = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                System.out.print(key);
            }
            System.out.println(); // New line after each key
        }
    }
}

