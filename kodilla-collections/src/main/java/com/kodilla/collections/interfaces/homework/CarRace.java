package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car carSaab = new Saab();
        Car carFord = new Ford();
        Car carChevrolet = new Chevrolet();

        System.out.println("Saab : ");
        doRace(carSaab);

        System.out.println("Ford: ");
        doRace(carFord);

        System.out.println("Chevrolet: ");
        doRace(carChevrolet);

    }
    public static void doRace(Car car){
        for(int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for(int i = 0; i < 2; i++){
            car.decreaseSpeed();
        }
        System.out.println("Actual car speed: " + car.getSpeed());
    }
}
