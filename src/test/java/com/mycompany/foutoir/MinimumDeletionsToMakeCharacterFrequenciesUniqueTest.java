package com.mycompany.foutoir;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    @Test
    void minDeletions() {
        MinimumDeletionsToMakeCharacterFrequenciesUnique deletions = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        assertEquals(0, deletions.minDeletions("aab"));
        assertEquals(2, deletions.minDeletions("aaabbbcc"));
        assertEquals(2, deletions.minDeletions("ceabaacb"));
    }
}