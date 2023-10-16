package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ShippingCenterTest {

    @Test
    public void shouldCheckPackageWeight(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean weight = bean.deliverPackage("New York", 30);
        Assertions.assertEquals(true, weight);
    }

    @Test
    public void testSendPackageFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.fail("New York");
        Assertions.assertNotNull(address);
    }

    @Test
    public void testSendPackageSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.success("New York");
        Assertions.assertNotNull(address);
    }
}