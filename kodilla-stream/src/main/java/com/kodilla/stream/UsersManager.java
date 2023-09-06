package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

    }
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<String> filterAgeGroup() {
        List<String> usernamesAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 51)
                .map(User::getUsername)
                .collect(Collectors.toList());
        return usernamesAge;
    }
    public static List<String> filterByName() {
        List<String> usernamesAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getUsername().contains("Walter"))
                .map(User::getUsername)
                .collect(Collectors.toList());
        return usernamesAge;
    }


    public static String getUserName(User user) {
        return user.getUsername();
    }

}
