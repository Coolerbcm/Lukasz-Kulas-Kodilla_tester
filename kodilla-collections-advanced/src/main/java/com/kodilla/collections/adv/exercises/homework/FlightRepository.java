package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Zielona Góra"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Gdańsk", "Hamburg"));
        flights.add(new Flight("Gdańsk", "Lublin"));
        flights.add(new Flight("Gdańsk", "Malmo"));
        flights.add(new Flight("Gdańsk", "Kopenhaga"));
        flights.add(new Flight("Gdańsk", "Goteborg"));
        flights.add(new Flight("Gdańsk", "Praga"));

        return flights;
    }
}
