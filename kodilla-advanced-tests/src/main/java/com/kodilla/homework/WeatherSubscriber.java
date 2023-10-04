package com.kodilla.homework;

import java.util.Objects;

public class WeatherSubscriber {
    private String name;

    public WeatherSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void notify(String message) {
        System.out.println(name + " notification: " + message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherSubscriber that = (WeatherSubscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
