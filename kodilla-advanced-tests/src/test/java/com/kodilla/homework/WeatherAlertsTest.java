package com.kodilla.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class WeatherAlertsTest {


    WeatherAlerts weatherAlerts = Mockito.mock(WeatherAlerts.class);
    UserLocation Madrid = Mockito.mock(UserLocation.class);
    UserLocation Lisboa = Mockito.mock(UserLocation.class);

    WeatherSubscriber subscriberMatt = Mockito.mock(WeatherSubscriber.class);
    WeatherSubscriber subscriberWalter = Mockito.mock(WeatherSubscriber.class);
    WeatherSubscriber subscriberMack = Mockito.mock(WeatherSubscriber.class);


    @Test
    void shouldSendNotificationToLocationSubscribers() {

        Madrid.subscribe(subscriberMatt);
        Madrid.subscribe(subscriberWalter);

        weatherAlerts.registerLocation(Madrid);
        weatherAlerts.sendNotificationToLocation(Madrid, "Weather alert, strong wind.");

        verify(Madrid, Mockito.times(2)).subscribe(Mockito.any());
    }

    @Test
    void shouldSendNotificationToAllSubscribers() {

        Madrid.subscribe(subscriberMatt);
        Madrid.subscribe(subscriberWalter);
        Lisboa.subscribe(subscriberMack);

        weatherAlerts.registerLocation(Madrid);
        weatherAlerts.registerLocation(Lisboa);
        weatherAlerts.sendNotificationToAll("Weather alert: Strong rain in your area !");

        verify(weatherAlerts, Mockito.times(1));
    }

    @Test
    void shouldUnsubscribeFromLocation() {

        Madrid.subscribe(subscriberMatt);
        Madrid.subscribe(subscriberWalter);

        weatherAlerts.registerLocation(Madrid);
        weatherAlerts.sendNotificationToLocation(Madrid, "Weather alert, strong wind.");

        Madrid.unsubscribe(subscriberMatt);

        verify(Madrid, Mockito.times(1));
    }

    @Test
    void shouldUnsubscribeFromAllLocations() {

        Madrid.subscribe(subscriberMatt);
        Madrid.subscribe(subscriberWalter);
        Lisboa.subscribe(subscriberMack);

        weatherAlerts.registerLocation(Madrid);
        weatherAlerts.registerLocation(Lisboa);
        weatherAlerts.sendNotificationToAll("Weather alert, strong wind !");

        Madrid.unsubscribeAll();
        Lisboa.unsubscribeAll();
        weatherAlerts.sendNotificationToAll("Weather alert, strong wind !");

        verify(weatherAlerts, Mockito.times(0));
    }
}
