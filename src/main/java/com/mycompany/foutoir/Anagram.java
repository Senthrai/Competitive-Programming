package com.mycompany.foutoir;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(char letter : t.toCharArray()){
            if(!map.containsKey(letter) || map.get(letter) <= 0) return false;

            map.put(letter,map.get(letter)-1 );
        }
        return true;
    }

    public boolean isAnagramUnicode(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int codePointS = s.codePointAt(i);
            int codePointT = t.codePointAt(i);

            map.put(codePointS, map.getOrDefault(codePointS, 0) + 1);
            map.put(codePointT, map.getOrDefault(codePointT, 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
