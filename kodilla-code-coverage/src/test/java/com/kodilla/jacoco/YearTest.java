package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void testLeapYear() {

        assertTrue(new Year(2000).isLeap());
        assertTrue(new Year(2020).isLeap());


        assertFalse(new Year(1900).isLeap());
        assertFalse(new Year(2100).isLeap());


        assertTrue(new Year(2016).isLeap());
        assertTrue(new Year(2024).isLeap());


        assertFalse(new Year(1900).isLeap());
        assertFalse(new Year(2100).isLeap());

        assertTrue(new Year(2024).isLeap());
        assertFalse(new Year(2022).isLeap());
    }

}
