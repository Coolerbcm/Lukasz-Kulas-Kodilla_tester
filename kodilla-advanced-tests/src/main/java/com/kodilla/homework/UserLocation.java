package com.kodilla.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserLocation {
    private String locationName;
    private Set<WeatherSubscriber> subscribers = new HashSet<>();

    public UserLocation(String locationName) {
        this.locationName = locationName;
    }

    public void subscribe(WeatherSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(WeatherSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void unsubscribeAll() {
        subscribers.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLocation that = (UserLocation) o;
        return Objects.equals(locationName, that.locationName);
    }

    @Override
    public int hashCode() {
        return locationName != null ? locationName.hashCode() : 0;
    }
}