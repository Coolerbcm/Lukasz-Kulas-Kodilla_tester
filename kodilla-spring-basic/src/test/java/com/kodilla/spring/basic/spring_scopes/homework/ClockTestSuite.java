package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ClockTestSuite {

    @Test
    public void testDifferentClocks(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);

        Assertions.assertNotEquals(clock1.getTime(), clock2.getTime());
    }

}