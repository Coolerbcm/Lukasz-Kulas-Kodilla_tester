package com.kodilla.spring.basic.dependency_injection.homework;

public class KodillaDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package is too heavy");
            return false;
        }
        System.out.println("Kodilla delivery is in progress...");
        return true;
    }
}

