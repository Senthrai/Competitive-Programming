package com.mycompany.foutoir;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public String reverseWords(String s) {
        String trim = s.trim();
        String result = trim.replaceAll("\\s+", " ");
        String[] arrS = result.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = arrS.length-1; i >= 0; i--) {
            if(i==0){
                builder.append(arrS[i]);
            }else{
                builder.append(arrS[i]).append(" ");
            }
        }
        return builder.toString();
    }

    public String reverseWords2(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
