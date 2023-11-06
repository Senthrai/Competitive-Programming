package com.mycompany.foutoir;

import java.util.function.Supplier;

public class LazyExample {
    public static void main(String[] args) {
        System.out.println("TEST");
        // Create a lazy supplier to compute the square of 5
        Supplier<Integer> lazySquare = () -> computeSquare(5);
        System.out.println("TEST1");
        // The square is not computed yet
        System.out.println("TEST2");
        // Now, let's get the square value
        int result = lazySquare.get();
        System.out.println("TEST3");
        // The square is computed and stored in 'result'
        System.out.println("The square is: " + result);
    }

    // A method to compute the square of a number
    public static int computeSquare(int num) {
        System.out.println("Computing square...");
        return num * num;
    }
}
