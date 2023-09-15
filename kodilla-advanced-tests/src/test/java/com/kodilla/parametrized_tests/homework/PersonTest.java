package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testGetBMI() {
        TestDataGenerator dataGenerator = new TestDataGenerator();
        Person person = new Person(dataGenerator.getHeightInMeters(), dataGenerator.getWeightInKilogram());
        assertEquals("Overweight", person.getBMI());
    }
}