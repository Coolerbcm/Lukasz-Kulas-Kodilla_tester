package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class shippingCenterTest2 {

    @Mock
    private DeliveryService deliveryService;

    @Mock
    private NotificationService notificationService;

    @InjectMocks
    private ShippingCenter shippingCenter;

    @Test
    public void testSendPackageSuccess() {
        String address = "123 Main St";
        double weight = 20.0;

        Mockito.when(deliveryService.deliverPackage(address, weight)).thenReturn(true);
        Mockito.when(notificationService.success(address)).thenReturn("Package delivered to: " + address);

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package delivered to: " + address, result);
    }

    @Test
    public void testSendPackageFail() {

        String address = "123 Main St";
        double weight = 35.0;

        Mockito.when(deliveryService.deliverPackage(address, weight)).thenReturn(false);
        Mockito.when(notificationService.fail(address)).thenReturn("Package not delivered to: " + address);

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package not delivered to: " + address, result);
    }
}