/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foutoir;

/**
 *
 * @author senth
 */
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Access elements in the list
        System.out.println("Elements in the linked list:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Add an element at a specific index
        linkedList.add(1, "Orange");
        System.out.println("\nUpdated elements in the linked list:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Remove an element from the list
        linkedList.remove(2);
        System.out.println("\nElements in the linked list after removal:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
