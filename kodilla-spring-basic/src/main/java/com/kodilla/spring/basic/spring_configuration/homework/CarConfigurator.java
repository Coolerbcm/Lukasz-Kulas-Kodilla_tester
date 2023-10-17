package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class CarConfigurator {

    @Bean
    public Car Sedan(){

        return new Sedan(true);
    }
        @Bean
        public Car CarConfigurator(){
        LocalTime currentTime = LocalTime.now();
        if (Summer()){
            return new Cabrio(LightsOn(currentTime));
        } else if (Winter()) {
            return new SUV(LightsOn(currentTime));
        } else {
            return new Sedan(LightsOn(currentTime));
        }
    }

    private boolean Summer(){
        int currentMonth = LocalDate.now().getMonthValue();
        return currentMonth >=6 && currentMonth<=8;
    }

    private boolean Winter(){
        int currentMonth = LocalDate.now().getMonthValue();
        return currentMonth >=12 || currentMonth <=2;
    }

    private boolean LightsOn(LocalTime currentTime){
        return currentTime.isAfter(LocalTime.of(20, 0)) || currentTime.isBefore(LocalTime.of(6, 0));
    }
}
