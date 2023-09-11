package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testToGetWrongOrder (){
        // given
        Warehouse warehouse = new Warehouse();
        // when

        // then
        assertThrows(OrderDoesntExistException.class, ()->warehouse.getOrder("1"));
    }
}