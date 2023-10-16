package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CalculatorTest {

    @Mock
    private Display display;

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(display);
        Assertions.assertEquals(8, calculator.add(5,3));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator(display);
        Assertions.assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator(display);
        Assertions.assertEquals(15, calculator.multiply(5,3));
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator(display);
        Assertions.assertEquals(2, calculator.divide(6,3));
    }

}