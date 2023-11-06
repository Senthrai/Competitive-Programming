package com.mycompany.foutoir;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {

    @Test
    void hIndex() {
        HIndex hIndex = new HIndex();
        int[] citations = {100};
        assertEquals(1,hIndex.hIndex(citations));

        int[] citations2 = {12, 9, 5, 3, 2, 1, 1, 0};
        assertEquals(3,hIndex.hIndex(citations2));

        int[] citations3 = {20, 18, 15, 10, 8, 7, 5, 2};
        assertEquals(6,hIndex.hIndex(citations3));

        int[] citations4 = {25, 24, 23, 22, 21, 20, 19, 18, 17, 16};
        assertEquals(10,hIndex.hIndex(citations4));

        int[] citations5 = {5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(5,hIndex.hIndex(citations5));

        int[] citations6 = {0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(0,hIndex.hIndex(citations6));

        int[] citations7 = {10, 9, 8, 7, 6};
        assertEquals(5,hIndex.hIndex(citations7));

    }
}