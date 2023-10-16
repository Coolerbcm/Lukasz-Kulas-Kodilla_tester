package com.kodilla.collections.arrays.homework;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + car.getCarBrand());
        System.out.println("Car model: " + car.getCarModel());
        System.out.println("Car production date: " + car.getCarYear());
        System.out.println("Car color: " + car.getCarColor());
        System.out.println("Car body type: " + car.getCarBody());
        System.out.println("Car engine type: " + car.getCarEngine());
        System.out.println("Car max speed: " + car.getMaxSpeed() + " km/h");

    }

    public static void main(String[] args) {
        Car car = new Car("Ford", "F-150", 2022, "Red", "Pickup", "Gasoline");
        describeCar(car);
    }

}






