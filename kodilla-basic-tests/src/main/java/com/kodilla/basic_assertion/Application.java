package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.subtract(a, b);
        int powerResult = calculator.power(a);          // Sposób wykonania na podstawie sumy i odejmowania. [1]
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0.1);
        boolean correct2 = ResultChecker.assertEquals(-3, subResult, 0.1);
        boolean correctPower = ResultChecker.assertEquals(25, powerResult, 0.1);     // Sposób wykonania na podstawie sumy i odejmowania. [1]


        // Poniżej sposób wykonania z podpowiedzi zadania 3.5  [2]
        int liczbaCalkowita = 8;
        int potega = 2;
        double wynik = Math.pow(liczbaCalkowita, potega);
        System.out.println(liczbaCalkowita + " do potęgi " + potega + " = " + wynik);
        // Powyżej sposób wykonania z podpowiedzi zadania 3.5  [2]


        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb :  " + a + " i " + b);

        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb :  " + a + " i " + b);
        }

        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb :  " + a + " i " + b);

        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb :  " + a + " i " + b);
        }

        // Sposób wykonania na podstawie sumy i odejmowania. [1]
        if (correctPower){
            System.out.println("Metoda power działa poprawnie dla liczby : " + a);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby : " + a);
        }
    }
}
