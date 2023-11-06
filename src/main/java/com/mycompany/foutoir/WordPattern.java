package com.mycompany.foutoir;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }


    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapPattern = new HashMap<>();
        Map<String, Character> mapWord = new HashMap<>();
        String[] words = s.split(" ");

        for(int i = 0; i < pattern.length(); i++){
            char letter = pattern.charAt(i);
            String word = words[i];

            if(mapPattern.containsKey(letter)){
                if(!word.equals(mapPattern.get(letter)))return false;
            }else{
                mapPattern.put(letter, word);
            }

            if(mapWord.containsKey(word)){
                if(letter!=(mapWord.get(word)))return false;
            }else{
                mapWord.put(word, letter);
            }
        }
        return true;
    }

}
