package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jan Kowalski", new Teacher("Brzęczyszczykiewicz")));
        students.add(new Student("Andrzej Gołota", null));
        students.add(new Student("Michał Jasiński", new Teacher("Brzęczyszczykiewicz")));
        students.add(new Student("Robert Lewandowski", null));
        students.add(new Student("Jan Brzechwa", new Teacher("Jan Miodek")));
        students.add(new Student("Emil Rau", new Teacher("Jan Miodek")));
        students.add(new Student("Maria Skłodowska-Curie", new Teacher("Polon")));

        for (Student student : students) {
            String studentName = student.getName();
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            String teacherName = optionalTeacher.map(Teacher::getName).orElse("<undefined>");

            System.out.println("Uczeń: " + studentName + ", nauczyciel: " + teacherName );

        }
    }
}
