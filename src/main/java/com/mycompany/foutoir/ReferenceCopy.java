package com.mycompany.foutoir;

public class ReferenceCopy {

    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a,b);
        System.out.println("a : " + a + " b : " + b);
    }

    static void swap(int x, int y){
        int t;

        t = x;
        x = y;
        y = t;

        System.out.println("x : " + x + " y : " + y);
    }
}
