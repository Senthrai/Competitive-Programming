package com.mycompany.foutoir;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if the character in s has already been mapped to a different character in t
            if (sToTMap.containsKey(charS)) {
                if (sToTMap.get(charS) != charT) {
                    return false;
                }
            } else {
                sToTMap.put(charS, charT);
            }

            // Check if the character in t has already been mapped to a different character in s
            if (tToSMap.containsKey(charT)) {
                if (tToSMap.get(charT) != charS) {
                    return false;
                }
            } else {
                tToSMap.put(charT, charS);
            }
        }

        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;

    }
}
