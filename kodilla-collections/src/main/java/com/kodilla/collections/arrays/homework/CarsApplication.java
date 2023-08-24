package com.kodilla.collections.arrays.homework;
import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {
        Random random = new Random();
        String[] makers = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes", "Volvo", "Saab"};
        int randomMakerIndex = random.nextInt(makers.length);

        String[] models = {"Corolla", "Civic", "F-150", "Suburban", "F90", "W190", "V90", "9-3"};
        int randomModelIndex = random.nextInt(models.length);

        int year = 2000 + random.nextInt(24);

        String[] colors = {"Red", "Blue", "Green", "White", "Black", "Orange", "Yellow", "Grey"};
        String color = colors[random.nextInt(colors.length)];

        String[] bodies = {"Sedan", "SUV", "Pickup", "Convertible", "Wagon", "Hatchback"};
        String body = bodies[random.nextInt(bodies.length)];

        String[] engines = {"Gasoline", "Diesel", "Electric", "Hybrid"};
        String engine = engines[random.nextInt(engines.length)];

        int maxSpeed = 100 + random.nextInt(160);

        Car car = new Car(makers[randomMakerIndex], models[randomModelIndex], year, color, body, engine);
        car.setMaxSpeed(maxSpeed);
        return car;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
