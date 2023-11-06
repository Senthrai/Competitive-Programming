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

class KeyValuePair<K, V> {
    K key;
    V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class HashTable<K, V> {
    private LinkedList<KeyValuePair<K, V>>[] buckets;
    private int capacity;
    private int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % capacity);
    }

    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> bucket = buckets[bucketIndex];
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                pair.value = value; // Update value if key already exists
                return;
            }
        }
        bucket.add(new KeyValuePair<>(key, value)); // Add new key-value pair
        size++;
    }

    public V get(K key) {
        int bucketIndex = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> bucket = buckets[bucketIndex];
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                return pair.getValue(); // Return value if key is found
            }
        }
        return null; // Key not found
    }

    public void remove(K key) {
        int bucketIndex = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> bucket = buckets[bucketIndex];
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                bucket.remove(pair); // Remove key-value pair if key is found
                size--;
                return;
            }
        }
    }

    public boolean containsKey(K key) {
        int bucketIndex = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> bucket = buckets[bucketIndex];
        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                return true; // Key found
            }
        }
        return false; // Key not found
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class HashtableImplentationExample {
    public static void main(String[] args) {
        HashTable<String, Integer> hashtable = new HashTable<>(10);

        // Add key-value pairs to the hashtable
        hashtable.put("apple", 10);
        hashtable.put("banana", 20);
        hashtable.put("cherry", 30);

        // Retrieve values from the hashtable
        System.out.println("Value for 'apple': " + hashtable.get("apple"));
        System.out.println("Value for 'banana': " + hashtable.get("banana"));
        System.out.println("Value for 'grape': " + hashtable.get("grape"));

        // Remove a key-value pair from the hashtable
        hashtable.remove("apple");

        // Check if the hashtable contains a key
        System.out.println("Contains 'apple': " + hashtable.containsKey("apple"));
        System.out.println("Contains 'cherry': " + hashtable.containsKey("cherry"));

        // Check the size and emptiness of the hashtable
        System.out.println("Size: " + hashtable.size());
        System.out.println("Is Empty: " + hashtable.isEmpty());
    }
}

