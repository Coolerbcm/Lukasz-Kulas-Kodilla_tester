package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTest {
    private static FlightFinder flightFinder;

    @BeforeEach
    public void setUp() {
        flightFinder = new FlightFinder();
    }

    @Test
    void findFlightsFrom() {
        List<Flight> FlightsFromGdansk = flightFinder.findFlightsFrom("Gdańsk");
        assertEquals(10, FlightsFromGdansk.size());

        List<Flight> FlightsFromHamburg = flightFinder.findFlightsFrom("Hamburg");
        assertEquals(0, FlightsFromHamburg.size());
    }

    @Test
    void findFlightsTo() {

        List<Flight> FlightsToHamburg = flightFinder.findFlightsTo("Hamburg");
        assertEquals(1,FlightsToHamburg.size());

        List<Flight> FlightsToGdansk = flightFinder.findFlightsTo("Gdańsk");
        assertEquals(0,FlightsToGdansk.size());

    }

}