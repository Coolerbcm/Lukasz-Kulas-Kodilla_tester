package com.kodilla.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlerts {
    private Map<UserLocation, Set<WeatherSubscriber>> subscriptions = new HashMap<>();

    public void registerLocation(UserLocation location){
        subscriptions.put(location, new HashSet<>());
    }


    public void sendNotificationToLocation(UserLocation location, String message){
        subscriptions.get(location).forEach(s ->s.notify(message));
    }
    public void sendNotificationToAll(String message) {
        subscriptions.entrySet().forEach(e ->e.getValue().forEach(s->s.notify(message)));
    }

}
