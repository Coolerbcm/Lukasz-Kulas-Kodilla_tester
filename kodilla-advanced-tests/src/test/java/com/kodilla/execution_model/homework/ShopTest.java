package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();

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

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
    }

    @Test
    public void shouldFindCustomerByName() {
        List<Order> lukasOrders = shop.getOrdersByCustomerName("Lukas");
        assertEquals(1, lukasOrders.size());
    }

    @Test
    public void shouldNotFindCustomerWithNonExistentName() {
        List<Order> nonExistentCustomerOrders = shop.getOrdersByCustomerName("Josef");
        assertEquals(0, nonExistentCustomerOrders.size());
    }

    @Test
    public void shouldFindOrderByValue() {
        List<Order> ordersWithTargetValue = shop.getOrdersByValue(222);
        assertEquals(1, ordersWithTargetValue.size());
    }

    @Test
    public void shouldFindOrderByValueNonExisting() {
        List<Order> ordersWithTargetValue = shop.getOrdersByValue(1111);
        assertEquals(0, ordersWithTargetValue.size());
    }

    @Test
    public void shouldCountNumberOfOrders(){
        assertEquals(6, shop.getOrders().size());
    }

    @Test
    public void shouldCountOrdersWithDateRange(){
        assertEquals(2,shop.getOrdersByDateRange(LocalDate.of(2023,9,10),LocalDate.of(2023,9,13)).size() );
    }
}