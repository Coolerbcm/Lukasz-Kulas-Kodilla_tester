package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarConfiguratorTestSuite {

    @Test
    public void testSUVLights(){
       Car suv = new SUV(true);
        Assertions.assertTrue(suv.hasHeadlightsTurnedOn());
        Assertions.assertEquals("SUV", suv.getCarType());
    }
    @Test
    public void testSedanLights(){
       Car sedan = new Sedan(true);
        Assertions.assertTrue(sedan.hasHeadlightsTurnedOn());
        Assertions.assertEquals("Sedan", sedan.getCarType());
    }
    @Test
    public void testCabrioLights(){
        Car cabrio = new Cabrio(true);
        Assertions.assertTrue(cabrio.hasHeadlightsTurnedOn());
        Assertions.assertEquals("Cabrio", cabrio.getCarType());
    }

    @Test
    public void chosenCarAccordingToSeason(){
        CarConfigurator carConfigurator = new CarConfigurator();
        Assertions.assertEquals("SUV",carConfigurator.CarConfigurator().getCarType());
    }

    @Test
    public void shouldHavelightsOnDuringNightTime(){
        CarConfigurator carConfigurator = new CarConfigurator();
        Assertions.assertEquals(false, carConfigurator.CarConfigurator().hasHeadlightsTurnedOn());
    }
}