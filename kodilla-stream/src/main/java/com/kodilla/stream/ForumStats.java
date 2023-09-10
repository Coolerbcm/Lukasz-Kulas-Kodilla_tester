package com.kodilla.stream;

import java.util.List;

public class ForumStats {

    public static double averagePostCountAbove40(List<User> users, int userAge){
        return users.stream()
                .filter(user -> user.getAge() >=40)
                .mapToDouble(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }
    public static double averagePostCountBelow40(List<User> users, int userAge){
        return users.stream()
                .filter(user -> user.getAge() <40)
                .mapToDouble(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }
    public static double averagePostCountAbove58(List<User> users, int userAge){
        return users.stream()
                .filter(user -> user.getAge() >58)
                .mapToDouble(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double averagePostCountBelow0(List<User> users, int userAge){
        return users.stream()
                .filter(user -> user.getAge() <0)
                .mapToDouble(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }


    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averagePostCountAbove40 = averagePostCountAbove40(users, 40);
        double averagePostCountBelow40 = averagePostCountBelow40(users, 40);
        double averagePostCountAbove58 = averagePostCountAbove58(users, 58);
        double averagePostCountBelow0 = averagePostCountBelow0(users, 0);

        System.out.println("Average for users above and equal to 40 years old: " + averagePostCountAbove40);
        System.out.println("Average for users below 40 years old: " + averagePostCountBelow40);
        System.out.println("Average for users above to 58 years old: " + averagePostCountAbove58);
        System.out.println("Average for users below 0 years old: " + averagePostCountBelow0);

    }

}
