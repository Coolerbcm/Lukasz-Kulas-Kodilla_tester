 package com.kodilla.homework;

 import org.junit.jupiter.api.Test;
 import org.mockito.Mockito;

 import static org.mockito.Mockito.verify;

class WeatherAlertsTest {


    WeatherAlerts weatherAlerts = new WeatherAlerts();
    UserLocation madrid = Mockito.mock(UserLocation.class);
    UserLocation Lisboa = Mockito.mock(UserLocation.class);

    WeatherSubscriber subscriberMatt = Mockito.mock(WeatherSubscriber.class);
    WeatherSubscriber subscriberWalter = Mockito.mock(WeatherSubscriber.class);
    WeatherSubscriber subscriberMack = Mockito.mock(WeatherSubscriber.class);


    @Test
    void shouldSendNotificationToLocationSubscribers() {

        weatherAlerts.subscribe(madrid, subscriberWalter);
        weatherAlerts.subscribe(madrid, subscriberMatt);

        weatherAlerts.sendNotificationToLocation(madrid, "Weather alert, strong wind.");

        verify(subscriberWalter, Mockito.times(1)).notify(Mockito.any());
        verify(subscriberMatt, Mockito.times(1)).notify(Mockito.any());
    }





    // Do przerobienia wszystkie pozostale, na wzor powyzszego. //
    // Do przerobienia wszystkie pozostale, na wzor powyzszego. //
    // Do przerobienia wszystkie pozostale, na wzor powyzszego. //
    // Do przerobienia wszystkie pozostale, na wzor powyzszego. //


//    @Test
//    void shouldSendNotificationToAllSubscribers() {
//
//        madrid.subscribe(subscriberMatt);
//        madrid.subscribe(subscriberWalter);
//        Lisboa.subscribe(subscriberMack);
//
//        weatherAlerts.registerLocation(madrid);
//        weatherAlerts.registerLocation(Lisboa);
//        weatherAlerts.sendNotificationToAll("Weather alert: Strong rain in your area !");
//
//        verify(subscriberMatt, Mockito.times(1)).notify(any());
//        verify(subscriberWalter, Mockito.times(1)).notify(any());
//        verify(subscriberMack, Mockito.times(1)).notify(any());
//    }
//
//    @Test
//    void shouldUnsubscribeFromLocation() {
//
//        madrid.subscribe(subscriberMatt);
//        madrid.subscribe(subscriberWalter);
//
//        weatherAlerts.registerLocation(madrid);
//        weatherAlerts.sendNotificationToLocation(madrid, "Weather alert, strong wind.");
//
//        madrid.unsubscribe(subscriberMatt);
//
//        verify(madrid, Mockito.times(1));
//    }
//
//    @Test
//    void shouldUnsubscribeFromAllLocations() {
//
//        madrid.subscribe(subscriberMatt);
//        madrid.subscribe(subscriberWalter);
//        Lisboa.subscribe(subscriberMack);
//
//        weatherAlerts.registerLocation(madrid);
//        weatherAlerts.registerLocation(Lisboa);
//        weatherAlerts.sendNotificationToAll("Weather alert, strong wind !");
//
//        madrid.unsubscribeAll();
//        Lisboa.unsubscribeAll();
//        weatherAlerts.sendNotificationToAll("Weather alert, strong wind !");
//
//        verify(subscriberMatt, Mockito.times(0)).notify(any());
//        verify(subscriberWalter, Mockito.times(0)).notify(any());
//        verify(subscriberMack, Mockito.times(0)).notify(any());
//    }
}


