package com.mycompany.foutoir;

import java.util.HashMap;
import java.util.Map;

public class RomanceToInt {

    public static int romanceToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
    public int romanceToInt2(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }

        return ans;
    }

    public  int romanceToInt3(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);

            switch (currentLetter) {
                case 'I':
                    if (i + 1 < s.length()) {
                        char nextLetter = s.charAt(i + 1);
                        switch(nextLetter){
                            case 'V':
                                value += 4;
                                i++;
                                break;
                            case 'X':
                                value += 9;
                                i++;
                                break;
                            default :
                                value +=1;
                        }
                    } else {
                        value +=1;
                    }
                    break;
                case 'V':
                    value +=5;
                    break;
                case 'X':
                    if (i + 1 < s.length()) {
                        char nextLetter = s.charAt(i + 1);
                        switch(nextLetter){
                            case 'L':
                                value += 40;
                                i++;
                                break;
                            case 'C':
                                value += 90;
                                i++;
                                break;
                            default :
                                value +=10;
                        }
                    } else {
                        value +=10;
                    }
                    break;
                case 'L':
                    value +=50;
                    break;
                case 'C':
                    if (i + 1 < s.length()) {
                        char nextLetter = s.charAt(i + 1);
                        switch(nextLetter){
                            case 'D':
                                value += 400;
                                i++;
                                break;
                            case 'M':
                                value += 900;
                                i++;
                                break;
                            default :
                                value +=100;
                        }
                    } else {
                        value +=100;
                    }
                    break;
                case 'D':
                    value +=500;
                    break;
                case 'M':
                    value +=1000;
                    break;

            }
        }
        return value;
    }
}
