package com.kodilla.abstracts.homework;

abstract class Job {
    private double salary;
    private String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}

class Electrician extends Job {
    public Electrician(double salary, String responsibilities) {
        super(salary, responsibilities);
    }
}

class ServiceMan extends Job {
    public ServiceMan(double salary, String responsibilities) {
        super(salary, responsibilities);
    }
}

class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }
}

class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        System.out.println("Responsibilities of " + firstName + " at their job are: ");
        System.out.println(job.getResponsibilities());
    }
}