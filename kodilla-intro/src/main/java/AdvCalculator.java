public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        double a = UserDialogs.getValue();     //int a = UserDialogs.getValue();  Nie pozwala liczyc poprawnie dzielenia np. 6/5 --> wynik wynosil 1.0
        double b = UserDialogs.getValue();     //int b = UserDialogs.getValue();  Nie pozwala poprawnie liczyc dzielenia np. 6/5 --> wynik wynosil 1.0
        return switch (userSelected) {
            case "ADD" -> a + b;
            case "SUB" -> a - b;
            case "DIV" -> a / b;
            case "MUL" -> a * b;
            default -> 0;
        };
    }
}