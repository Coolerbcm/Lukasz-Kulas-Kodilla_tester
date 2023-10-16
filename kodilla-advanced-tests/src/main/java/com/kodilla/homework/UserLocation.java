package com.kodilla.homework;

import java.util.Objects;

public class UserLocation {
    private String locationName;

    public UserLocation(String locationName) {
        this.locationName = locationName;
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