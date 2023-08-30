package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> totalNumberOfStudents;

    public School(String name) {
        this.name = name;
        this.totalNumberOfStudents = new ArrayList<>();
    }
    public void addNumberOfStudents(int numberOfStudents) {
        totalNumberOfStudents.add(numberOfStudents);
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        int total = 0;
        for (int totalNumberOfStudents : totalNumberOfStudents) {
            total += totalNumberOfStudents;
        }
        return total;
    }
}