package com.vtalent;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

        public static void main(String[] args) {
            String input = "apple";
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }

            // Print the character frequencies in one line
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
            }
        }

}
