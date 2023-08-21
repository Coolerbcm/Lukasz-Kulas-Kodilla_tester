package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int sumResult = calculator.subtract(a, b);
        int powerResult = calculator.power(a);          // Sposób wykonania na podstawie sumy i odejmowania. [1]
        boolean correct = ResultChecker.assertEquals(3, sumResult);
        boolean correctPower = ResultChecker.assertEquals(64, powerResult);     // Sposób wykonania na podstawie sumy i odejmowania. [1]


        // Poniżej sposób wykonania z podpowiedzi zadania 3.5  [2]
        int liczbaCalkowita = 8;
        int potega = 2;
        double wynik = Math.pow(liczbaCalkowita, potega);
        System.out.println(liczbaCalkowita + " do potęgi " + potega + " = " + wynik);
        // Powyżej sposób wykonania z podpowiedzi zadania 3.5  [2]


        if (correct) {
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
