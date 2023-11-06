package com.mycompany.foutoir;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransposeMusic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the instructions and song
        String[] instructions = scanner.nextLine().split(" ");
        String originalKey = instructions[0];
        String targetKey = instructions[1];

        String[] song = scanner.nextLine().split(" ");

        // Transpose the song
        String transposedSong = transposeSong(song, originalKey, targetKey);

        // Print the transposed song
        System.out.println(transposedSong);

        scanner.close();
    }

    public static String transposeSong(String[] song, String originalKey, String targetKey) {
        // Define note order
        String noteOrder = "C C# D Eb E F F# G Ab A Bb B";
        String[] notes = noteOrder.split(" ");

        // Create a mapping of notes to their indices in the order
        Map<String, Integer> noteIndices = new HashMap<>();
        for (int i = 0; i < notes.length; i++) {
            noteIndices.put(notes[i], i);
        }

        // Calculate the transpose offset
        int offset = (noteIndices.get(targetKey) - noteIndices.get(originalKey) + notes.length) % notes.length;

        // Transpose each note in the song
        StringBuilder transposedSong = new StringBuilder();
        for (String note : song) {
            int index = (noteIndices.get(note) + offset) % notes.length;
            transposedSong.append(notes[index]).append(" ");
        }

        // Remove the trailing space
        return transposedSong.toString().trim();
    }
}
