package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void sleepIn() {
        CodingBat codingBat = new CodingBat();
        assertTrue(codingBat.sleepIn(false, false));
        assertFalse(codingBat.sleepIn(true, false));
        assertTrue(codingBat.sleepIn(false, true));
    }

    @org.junit.Test
    public void diff21() {
        CodingBat codingBat = new CodingBat();
        assertEquals(2, codingBat.diff21(19));
        assertEquals(11, codingBat.diff21(10));
        assertEquals(58, codingBat.diff21(50));
    }

    @org.junit.Test
    public void countEvens() {
        CodingBat codingBat = new CodingBat();
        assertEquals(2, codingBat.countEvens(new int[]{1, 2, 3, 4, 5}));
        assertEquals(3, codingBat.countEvens(new int[]{2, 100, 8}));
        assertEquals(0, codingBat.countEvens(new int[]{3, 5, 9, 13}));
    }

    @org.junit.Test
    public void helloName() {
        CodingBat codingBat = new CodingBat();
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello X!", codingBat.helloName("X"));
    }
}