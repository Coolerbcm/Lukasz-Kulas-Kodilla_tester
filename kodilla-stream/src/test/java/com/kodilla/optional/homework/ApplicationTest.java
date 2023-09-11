package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test

    void testStudentWithNameAndNoTeacher() {
        Student student1 = new Student("Andrzej Gołota", null);

        assertEquals("Andrzej Gołota", student1.getName());
        assertNull(student1.getTeacher());
    }

    @Test
     void testStudentWithNameAndTeacher() {
        Student student2 = new Student("Jan Kowalski", new Teacher("Brzęczyszczykiewicz"));
        assertEquals("Jan Kowalski", student2.getName());
        assertNotNull(student2.getTeacher());
        assertEquals("Brzęczyszczykiewicz", student2.getTeacher().getName());

    }

    @Test
    void testTeacherWithName() {
        Teacher teacher1 = new Teacher("Jan Miodek");

        assertEquals("Jan Miodek", teacher1.getName());
    }
}

