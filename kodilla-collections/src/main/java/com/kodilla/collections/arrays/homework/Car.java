package com.kodilla.collections.arrays.homework;

public class Car {
    private final String maker;
    private final String model;
    private final int year;
    private final String color;
    private final String body;
    private final String engine;
    private int maxSpeed;


    public Car(String maker, String model, int year, String color, String body, String engine) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.color = color;
        this.body = body;
        this.engine = engine;
    }


    public String getCarBrand() {
        return maker;
    }

    public String getCarModel() {
        return model;
    }

    public int getCarYear() {
        return year;
    }

    public String getCarColor() {
        return color;
    }

    public String getCarBody() {
        return body;
    }

    public String getCarEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

