package com.kodilla.inheritance.homework;

public class HowItWorks {
    public static void main(String[] args) {
        Windows95 windows95 = new Windows95(1995);
        WindowsXP windowsXP = new WindowsXP(2001);


        windows95.turnOn();
        windows95.turnOff();

        windowsXP.turnOn();
        windowsXP.turnOff();



    }
}
