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
        assertEquals(codingBat.diff21(19), 2);
        assertEquals(codingBat.diff21(10), 11);
        assertEquals(codingBat.diff21(50), 58);
    }

    @org.junit.Test
    public void countEvens() {
        CodingBat codingBat = new CodingBat();
        assertEquals(codingBat.countEvens(new int[]{1, 2, 3, 4, 5}), 2);
        assertEquals(codingBat.countEvens(new int[]{2, 100, 8}), 3);
        assertEquals(codingBat.countEvens(new int[]{3, 5, 9, 13}), 0);
    }

    @org.junit.Test
    public void helloName() {
        CodingBat codingBat = new CodingBat();
        assertEquals(codingBat.helloName("Bob"),"Hello Bob!");
        assertEquals(codingBat.helloName("Alice"),"Hello Alice!");
        assertEquals(codingBat.helloName("X"),"Hello X!");
    }
}