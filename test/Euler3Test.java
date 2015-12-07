package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Euler3Test {

    @Test
    public void testLargestPrimeFactor() throws Exception {
        assertEquals(2, Euler3.largestPrimeFactor(2));
        assertEquals(2, Euler3.largestPrimeFactor(4));
        assertEquals(7, Euler3.largestPrimeFactor(7));
        assertEquals(5, Euler3.largestPrimeFactor(15));
        assertEquals(7, Euler3.largestPrimeFactor(21));
        assertEquals(11, Euler3.largestPrimeFactor(2 * 3 * 5 * 7 * 11));
    }
}