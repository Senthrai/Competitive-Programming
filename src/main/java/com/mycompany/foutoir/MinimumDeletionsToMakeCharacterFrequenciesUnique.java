package com.mycompany.foutoir;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public static void main(String[] args) {

    }

    public int minDeletions(String s) {
        // Create a hashmap to count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Create a variable to keep track of the minimum deletions needed
        int deletions = 0;

        // Create a set to keep track of unique frequencies encountered
        HashSet<Integer> uniqueFrequencies = new HashSet<>();

         for (int frequency : charCount.values()) {
            while (uniqueFrequencies.contains(frequency) && frequency > 0) {
                // If we've encountered this frequency before, decrement it
                frequency--;
                deletions++;
            }

            // Add the current frequency to the set of unique frequencies
            uniqueFrequencies.add(frequency);
        }

        return deletions;
    }
}
