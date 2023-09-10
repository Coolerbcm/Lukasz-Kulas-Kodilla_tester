package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));

        try {
            Order order;
            order = warehouse.getOrder("1");
            System.out.println("Order number found: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            Order order;
            order = warehouse.getOrder("3");
            System.out.println("Order number found: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            Order order;
            order = warehouse.getOrder("2");
            System.out.println("Order number found: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            Order order;
            order = warehouse.getOrder("5");
            System.out.println("Order number found: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Order number 5 didn't found");
        }


    }
}