package com.kodilla.execution_model.homework;


import java.time.LocalDate;

public class Order {
    LocalDate date;
    double amount;
    String customer;

    public Order(LocalDate date, double amount, String customer) {
        this.date = date;
        this.amount = amount;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", amount=" + amount +
                ", customer='" + customer + '\'' +
                '}';
    }

    public Object getCustomerName() {
        return customer;
    }
    public double getOrderValue() {
        return amount;
    }
}
