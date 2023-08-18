package com.kodilla.abstracts.homework;

public class ApplicationShape {
    public static void main(String[] args) {
        Shape square = new Shape.Square(6);
        Shape circle = new Shape.Circle(7);
        Shape rectangle = new Shape.Rectangle(3,4);

        System.out.println("Square area : " + square.calculateArea() + " and Perimeter: " + square.calculatePerimeter());
        System.out.println("Circle area : " + circle.calculateArea() + " and Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle area : " + rectangle.calculateArea() + " and Perimeter: " + rectangle.calculatePerimeter());
    }
}
