package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args){
        Car car = new Car(4,5);
        car.openDoors();
        System.out.println();

        Convertible convertible = new Convertible(4,2);
        convertible.displayNumberOfSeats();
        car.turnOnLights();
        convertible.openRoof();
        convertible.closeRoof();
        System.out.println("Number of seats: " + convertible.getSeats());
        System.out.println("Number of wheels: "+ convertible.getWheels());
        convertible.openDoors();

    }
}
