package com.company;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fb = new Fibonacci();

    @org.junit.jupiter.api.Test
    void calcRek() {
        assertEquals(55, fb.calcRek(10));
        assertEquals(89, fb.calcRek(11));
        assertEquals(1, fb.calcRek(1));
        assertEquals(1, fb.calcRek(2));
        assertEquals(0, fb.calcRek(0));
    }

    @org.junit.jupiter.api.Test
    void calcRekTable() {
        assertEquals(55, fb.calcRekTable(10));
        assertEquals(89, fb.calcRekTable(11));
        assertEquals(1, fb.calcRekTable(1));
        assertEquals(1, fb.calcRekTable(2));
        assertEquals(0, fb.calcRekTable(0));
    }

    @org.junit.jupiter.api.Test
    void calcNerek() {
        assertEquals(55, fb.calcNerek(10));
        assertEquals(89, fb.calcNerek(11));
        assertEquals(1, fb.calcNerek(1));
        assertEquals(1, fb.calcNerek(2));
        assertEquals(0, fb.calcNerek(0));
    }
}