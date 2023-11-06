package com.mycompany.foutoir;

import java.util.*;

public class isSubsequence {
    public static void main(String[] args) {

    }

    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while(sPointer < s.length() && tPointer < t.length()){
            if(s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }

    public boolean isSubsequence2(String s, String t) {
        Map<Character, List<Integer>> index = new HashMap<>();

        // Preprocessing: create the index for characters in t
        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            index.computeIfAbsent(tChar, key -> new ArrayList<>()).add(i);
        }

        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length()) {
            char sChar = s.charAt(sPointer);

            // Check if the character exists in the index
            if (index.containsKey(sChar)) {
                List<Integer> positions = index.get(sChar);

                // Use Collections.binarySearch to find the position
                int newPos = Collections.binarySearch(positions, tPointer);

                // If newPos >= 0, it means the character was found after tPointer
                if (newPos >= 0) {
                    tPointer = positions.get(newPos) + 1;
                    sPointer++;
                } else {
                    return false; // Character not found in the required order
                }
            } else {
                return false; // Character not found in t
            }
        }

        return true;
    }

}
