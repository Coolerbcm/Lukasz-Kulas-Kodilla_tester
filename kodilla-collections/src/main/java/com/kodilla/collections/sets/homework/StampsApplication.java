package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Szpak",31.25 , 43, true));
        stamps.add(new Stamp("MS Natory", 31.25, 39.5, true));
        stamps.add(new Stamp("Cesarz Karol", 70, 90, false));
        stamps.add(new Stamp("Szpak", 31.25, 43, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
