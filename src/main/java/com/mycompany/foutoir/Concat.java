package com.mycompany.foutoir;

public class Concat {
//    implement static String concat(String[] strings){}
//
//    the strings should join character strings end to end , example "f" "o" "o" "bar" should result in "foobar"

    public static void main(String[] args) {
        String[] foobar = {"f","o","o","bar"};
        System.out.println(concat(foobar));
    }
    static String concat(String[] strings){
        StringBuilder builder = new StringBuilder();
        for (String word : strings) {
            builder.append(word);
        }
        return builder.toString();
    }
}
