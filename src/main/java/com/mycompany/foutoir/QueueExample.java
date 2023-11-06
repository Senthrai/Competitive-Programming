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
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Dave");

        // Dequeue elements
        String dequeuedElement = queue.remove();
        System.out.println("Dequeued Element: " + dequeuedElement);

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);

        // Print the elements in the queue
        System.out.println("Queue Elements:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}

