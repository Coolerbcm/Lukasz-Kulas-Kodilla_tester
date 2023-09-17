package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {

    private static Set<Order> orders;

    public Shop() {
        this.orders = new HashSet<>();
    }
        public static void main(String[] args) {

            LocalDate date1 = LocalDate.of(2023, 9, 11);
            LocalDate date2 = LocalDate.of(2023, 9, 12);
            LocalDate date3 = LocalDate.of(2023, 9, 13);
            LocalDate date4 = LocalDate.of(2023, 9, 14);
            LocalDate date5 = LocalDate.of(2023, 9, 15);
            LocalDate date6 = LocalDate.of(2023, 9, 16);

            Order order1 = new Order(date1, 222, "Lukas");
            Order order2 = new Order(date2, 2.25, "Evan");
            Order order3 = new Order(date3, 1.25, "George");
            Order order4 = new Order(date4, 1049.99, "Annie");
            Order order5 = new Order(date5, 2137, "Annie");
            Order order6 = new Order(date6, 507, "John");

            List<Order> orders = new ArrayList<>();
            orders.add(order1);
            orders.add(order2);
            orders.add(order3);
            orders.add(order4);
            orders.add(order5);
            orders.add(order6);

            LocalDate startDate = LocalDate.of(2023, 9, 10);
            LocalDate endDate = LocalDate.of(2023, 9, 17);

            List<Order> filteredOrders = new ArrayList<>();
            for (Order order : orders) {
                if (order.date.isAfter(startDate) && order.date.isBefore(endDate)) {
                    filteredOrders.add(order);
                }
            }

            for (Order order : filteredOrders) {
                System.out.println(order);
            }

            double maxAmount = getMaxAmount(filteredOrders);
            double minAmount = getMinAmount(filteredOrders);

            System.out.println("Highest order value: " + maxAmount);
            System.out.println("Lowest order value: " + minAmount);
            System.out.println("Number of orders placed: " + filteredOrders.size());

            double totalAmount = 0.0;
            for (Order order : filteredOrders) {
                totalAmount += order.amount;
            }
            System.out.println("Total value of orders placed: " + totalAmount);
        }
    public static double getMinAmount(List<Order> orders) {
        if (orders.isEmpty()) {
            return 0.0;
        }
        double min = orders.get(0).amount;
        for (Order order : orders) {
            if (order.amount < min) {
                min = order.amount;
            }
        }
        return min;
    }
    public static double getMaxAmount(List<Order> orders) {
        if (orders.isEmpty()) {
            return 0.0;
        }
        double max = orders.get(0).amount;
        for (Order order : orders) {
            if (order.amount > max) {
                max = order.amount;
            }
        }
        return max;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersByCustomerName(String customerName) {
        List<Order> customerOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomerName().equals(customerName)) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }
    public List<Order> getOrdersByValue(double value) {
        List<Order> matchingOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderValue() == value) {
                matchingOrders.add(order);
            }
        }
        return matchingOrders;
    }
    public List<Order> getOrdersByDateRange(LocalDate startDate, LocalDate endDate) {
        List<Order> ordersInDateRange = new ArrayList<>();
        for (Order order : orders) {
            if (order.date.isAfter(startDate) && order.date.isBefore(endDate)) {
                ordersInDateRange.add(order);
            }
        }
        return ordersInDateRange;

    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }
}

