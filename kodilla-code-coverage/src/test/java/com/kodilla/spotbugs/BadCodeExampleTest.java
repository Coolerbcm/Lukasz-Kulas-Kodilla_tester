package com.kodilla.spotbugs;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BadCodeExampleTest {


    @Test
    public void testEqualsWhenComparingWithDifferentTypeFieldThenFalse() {
        BadCodeExample badCodeExample1 = new BadCodeExample("type1");
        BadCodeExample badCodeExample2 = new BadCodeExample("type2");
        assertThat(badCodeExample1.equals(badCodeExample2)).isFalse();
    }

    @Test
    public void testEqualsWhenComparingWithSameTypeAndFieldThenTrue() {
        BadCodeExample badCodeExample1 = new BadCodeExample("type1");
        BadCodeExample badCodeExample2 = new BadCodeExample("type1");
        assertThat(badCodeExample1.equals(badCodeExample2)).isTrue();
    }

    @Test
    public void testHashCodeWhenCalledOnEqualObjectsThenEqual() {
        BadCodeExample badCodeExample1 = new BadCodeExample("type1");
        BadCodeExample badCodeExample2 = new BadCodeExample("type1");
        assertThat(badCodeExample1.hashCode()).isEqualTo(badCodeExample2.hashCode());
    }

}