package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.Car;
import com.kodilla.collections.arrays.homework.CarUtils;



import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car hyundai = new Car("Hyundai", "Sonata", 20010, "Red", "Sedan", "Gasoline");
        cars.add(hyundai);

        cars.add(new Car("Saab", "9-3", 2004, "Black", "Sedan", "Gasoline"));
        cars.add(new Car("Ford", "F-150", 2022, "Red", "Pickup", "Gasoline"));
        cars.add(new Car("Honda", "Accord", 2010, "Silver", "Sedan", "Gasoline"));
        cars.add(new Car("Toyota", "Corolla", 2020, "White", "Hatchback", "Diesel"));
        cars.add(new Car("Mercedes", "W201", 1990, "Silver", "Wagon", "Diesel"));

        System.out.println("Number of cars in the list: " + cars.size() +  " <-- before removal");

        cars.remove(5);
        System.out.println("Number of cars in the list: " + cars.size() + " <-- After using remove(int index) ");

        cars.remove(hyundai);
        System.out.println("Number of cars in the list: " + cars.size() + " <-- After using remove(object o) ");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

