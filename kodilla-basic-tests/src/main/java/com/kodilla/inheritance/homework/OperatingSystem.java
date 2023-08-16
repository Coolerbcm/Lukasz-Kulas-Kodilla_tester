package com.kodilla.inheritance.homework;

class OperatingSystem {
    private final int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }
        public void turnOn() {
            System.out.println("Welcome to Windows operating system.");
    }

        public void turnOff() {

   }
}
class Windows95 extends OperatingSystem {
    public Windows95(int releaseYear) {
        super(releaseYear);
    }
    @Override
        public void turnOn() {
            System.out.println("Windows95 is turning on.");
            super.turnOn();
    }
    @Override
        public void turnOff() {
            System.out.println("It's now safe to turn off your computer");
            super.turnOff();
    }
}

class WindowsXP extends OperatingSystem {
        public WindowsXP(int releaseYear) {
        super(releaseYear);
    }

    @Override
        public void turnOn() {
            System.out.println("Windows XP is turning on.");
            super.turnOn();
    }

    @Override
        public void turnOff() {
            System.out.println("Windows is shutting down...");
            super.turnOff();
    }
}



