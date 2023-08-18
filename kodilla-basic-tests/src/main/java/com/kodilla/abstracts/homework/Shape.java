package com.kodilla.abstracts.homework;

public abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    static class Square extends Shape {
        private double sideLenght;

        public Square(double sideLenght) {
            this.sideLenght = sideLenght;
        }
        @Override
        double calculateArea() {
            return sideLenght * sideLenght;
        }
        @Override
        double calculatePerimeter() {
            return sideLenght * 4;
        }
    }
    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    static class Rectangle extends Shape {
        private double lenght;
        private double height;

        public Rectangle(double lenght, double height) {
            this.lenght = lenght;
            this.height = height;
        }
        @Override
        double calculateArea() {
            return lenght * height;
        }
        @Override
        double calculatePerimeter() {
            return 2 * (lenght + height);
        }
    }
}
