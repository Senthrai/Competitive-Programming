/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foutoir;

/**
 *
 * @author senth
 */
import java.util.Hashtable;

public class HashtableExample {

    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        // Access values in the Hashtable
        System.out.println("Values in the Hashtable:");
        for (String value : hashtable.values()) {
            System.out.println(value);
        }

        // Remove a key-value pair from the Hashtable
        hashtable.remove(2);
        System.out.println("\nValues in the Hashtable after removal:");
        for (String value : hashtable.values()) {
            System.out.println(value);
        }
    }
}
