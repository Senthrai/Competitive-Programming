/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foutoir;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of characters in the magazine string
        for (char c : magazine.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0)+1);
        }

        // Check if ransomNote can be constructed using characters from magazine
        for (char c : ransomNote.toCharArray()) {
            int count = charFrequencyMap.getOrDefault(c, 0);
            if (count == 0) {
                return false; // Character not available in magazine
            }
            charFrequencyMap.put(c, count - 1); // Reduce the count of used character
        }

        return true;
    }
    
    public static boolean canConstruct2(String ransomNote, String magazine) {
        // Convert both strings to character arrays
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();

        // Sort the character arrays
        Arrays.sort(ransomNoteChars);
        Arrays.sort(magazineChars);

        int i = 0; // Index for ransomNoteChars
        int j = 0; // Index for magazineChars

        // Compare characters one by one
        while (i < ransomNoteChars.length && j < magazineChars.length) {
            if (ransomNoteChars[i] == magazineChars[j]) {
                i++; // Move to the next character in ransomNoteChars
                j++; // Move to the next character in magazineChars
            } else {
                j++; // Move to the next character in magazineChars
            }
        }

        // If we reached the end of ransomNoteChars, it means all characters were found
        // Otherwise, some characters from ransomNote were not present in magazine
        return i == ransomNoteChars.length;
    }

     public static boolean canConstruct3(String ransomNote, String magazine) {
        int[] charFrequency = new int[26]; // Assuming only lowercase letters, use 26 for the alphabet

        // Count the frequency of characters in the magazine string
        for (char c : magazine.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        // Check if ransomNote can be constructed using characters from magazine
        for (char c : ransomNote.toCharArray()) {
            int index = c - 'a';
            if (charFrequency[index] == 0) {
                return false; // Character not available in magazine
            }
            charFrequency[index]--; // Reduce the count of used character
        }

        return true;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(canConstruct3("cat", "tac")); // Output: false
        System.out.println(canConstruct3("astrono", "gastrono")); // Output: false
        System.out.println(canConstruct3("aa", "bcdefghijklaa")); // Output: true
    }
}
