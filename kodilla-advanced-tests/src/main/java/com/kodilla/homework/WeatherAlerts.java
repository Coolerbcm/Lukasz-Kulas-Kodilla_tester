package com.kodilla.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlerts {
    private Map<UserLocation, Set<WeatherSubscriber>> subscriptions = new HashMap<>();

    public void subscribe(UserLocation location, WeatherSubscriber subscriber) {
        Set<WeatherSubscriber> currentSubscribers = subscriptions.getOrDefault(location, new HashSet<>());
        currentSubscribers.add(subscriber);
        subscriptions.put(location, currentSubscribers);
    }

    public void unSubscribe(UserLocation location, WeatherSubscriber subscriber) {
        Set<WeatherSubscriber> currentSubscribers = subscriptions.get(location);
        currentSubscribers.remove(subscriber);
        subscriptions.put(location, currentSubscribers);
    }



    public void sendNotificationToLocation(UserLocation location, String message){
        subscriptions.get(location).forEach(s ->s.notify(message));
    }
    public void sendNotificationToAll(String message) {
        subscriptions.entrySet().forEach(e ->e.getValue().forEach(s->s.notify(message)));
    }

}
