package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
public class ClockTestSuite {

    @Autowired
    private Clock clock;

    @Test
    public void testGetTimeWhenCalledThenReturnCurrentTime() {
        // Arrange
        // Clock object is already arranged and injected by Spring

        // Act
        LocalTime result = clock.getTime();

        // Assert
        LocalTime now = LocalTime.now();
        // We check if the time returned by clock.getTime() is within a reasonable range of the current time.
        // This accounts for the time that may have passed between getting 'now' and 'result'.
        assertTrue(result.isBefore(now.plusSeconds(1)) && result.isAfter(now.minusSeconds(1)),
                "The time should be close to the current time");
    }
}