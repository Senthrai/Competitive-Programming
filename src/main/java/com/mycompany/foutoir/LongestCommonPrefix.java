package com.mycompany.foutoir;

public class LongestCommonPrefix {

    static String[] strs = {"flower", "flow", "flight"};
    static String[] strs1 = {"c", "acc", "ccc"};

    public static void main(String[] args) {
        System.err.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));
    }
    public static String longestCommonPrefix(String[] strs) {


        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(prefix.length() > 0 && !strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
