package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {

    private final UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"JanKowalski123", "Jan.Kowalski.123", "Jan-Kowalski-123", "JanKowalski_123"})
    void shouldValidateValidUsernames(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jan Kowalski 123", "JanKowalski!!!", "JanKowalski.123(123)", "Ja"})
    void shouldNotValidateInvalidUsernames(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource({"Jan@gmail.com", "JanKowalski_123@wp.pl", "JanKowalski-123_123.123@yahoo.co.uk"})
    void shouldValidateValidEmails(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"JanKowalski@com", "JanKowalski.com", "@gmail.com", "JanKowalski@gmail.", "JanKowalski-123_123.123@.com"})
    void shouldNotValidateInvalidEmails(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}