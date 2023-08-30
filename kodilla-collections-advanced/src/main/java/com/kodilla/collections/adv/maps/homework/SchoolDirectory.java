package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolPrincipalMap = new HashMap<>();

        Principal principalHarry = new Principal("Harry Potter");
        School schoolHarvard = new School("Harvard");
        schoolPrincipalMap.put(schoolHarvard, principalHarry);
        schoolHarvard.addNumberOfStudents(500);

        Principal principalBarry = new Principal("Barry Seal");
        School schoolPrinceton = new School("Princeton");
        schoolPrincipalMap.put(schoolPrinceton, principalBarry);
        schoolPrinceton.addNumberOfStudents(250);

        Principal principalLarry = new Principal("Larry Wheels");
        School schoolCambridge = new School("Cambridge");
        schoolPrincipalMap.put(schoolCambridge, principalLarry);
        schoolCambridge.addNumberOfStudents(150);

        Principal principalGarry = new Principal("Garry Kasparov");
        School schoolStanford = new School("Stanford");
        schoolPrincipalMap.put(schoolStanford, principalGarry);
        schoolStanford.addNumberOfStudents(750);

        for (Map.Entry<School, Principal> entry : schoolPrincipalMap.entrySet()) {
            School school = entry.getKey();
            Principal principal = entry.getValue();
            int totalStudents = school.getTotalStudents();

            System.out.println("----------------------------------");
            System.out.println("School : " + school.getName());
            System.out.println("Principal : " + principal.getName());
            System.out.println("Total students : " + totalStudents);
            System.out.println("----------------------------------");

        }
    }
}
