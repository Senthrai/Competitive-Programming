package com.mycompany.foutoir;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanceToIntTest {
    @Test
    public void test() {
        assertEquals(3, RomanceToInt.romanceToInt("III"));
        assertEquals(58, RomanceToInt.romanceToInt("LVIII"));
        assertEquals(1994, RomanceToInt.romanceToInt("MCMXCIV"));
    }
}