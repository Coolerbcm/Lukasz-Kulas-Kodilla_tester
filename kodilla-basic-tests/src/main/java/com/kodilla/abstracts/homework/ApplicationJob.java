package com.kodilla.abstracts.homework;


public class ApplicationJob {
    public static void main(String[] args) {
        Electrician electrician = new Electrician(6000, "Install cabling, electrical apparatus, repair failures.");
        ServiceMan serviceman = new ServiceMan(6000, "Conducts periodic inspections and removes failures");
        Doctor doctor = new Doctor(20000, "Diagnose and treats patients.");

        Person person1 = new Person("Alan", 33, electrician);
        Person person2 = new Person("Bob", 44, serviceman);
        Person person3 = new Person("Chris", 55, doctor);


        person1.displayResponsibilities();
        person2.displayResponsibilities();
        person3.displayResponsibilities();
    }
}




