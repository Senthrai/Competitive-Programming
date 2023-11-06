/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foutoir;

/**
 *
 * @author senth
 */
import java.util.PriorityQueue;

public class HeapExample {

    public static void main(String[] args) {
        // Create a PriorityQueue (max heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(java.util.Collections.reverseOrder());

        // Add elements to the heap
        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(10);
        maxHeap.add(7);

        // Peek the maximum element without removing it
        int maxElement = maxHeap.peek();
        System.out.println("Max Element: " + maxElement);

        // Remove the maximum element
        int removedElement = maxHeap.poll();
        System.out.println("Removed Element: " + removedElement);

        // Iterate over the elements in the heap
        System.out.println("Heap elements:");
        while (!maxHeap.isEmpty()) {
            int element = maxHeap.poll();
            System.out.println(element);
        }
    }
}
