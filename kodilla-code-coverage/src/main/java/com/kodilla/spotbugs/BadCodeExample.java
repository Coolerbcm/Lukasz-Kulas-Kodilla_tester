package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private String type;



    public BadCodeExample(String type) {
        this.type = type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample badCodeExample = (BadCodeExample) o;

        return type != null ? type.equals(badCodeExample.type) : badCodeExample.type == null;
    }


}