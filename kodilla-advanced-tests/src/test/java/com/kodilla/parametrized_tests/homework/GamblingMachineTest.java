/* package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {
    private GamblingMachine gamblingMachine;

    @BeforeEach
    void setUp(){
        gamblingMachine = new GamblingMachine();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testNumbers.csv", numLinesToSkip = 1)
    void shouldReturnCorrectWinsCount(int num1, int num2, int num3, int num4, int num5, int num6, int expectedResult) {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(num1, num2, num3, num4, num5, num6));
        try {
            int actualResult = gamblingMachine.howManyWins(userNumbers);
            assertEquals(expectedResult, actualResult);
        } catch (InvalidNumbersException e) {
            fail("Exception should not be thrown for valid numbers");
        }
    }

}

 */