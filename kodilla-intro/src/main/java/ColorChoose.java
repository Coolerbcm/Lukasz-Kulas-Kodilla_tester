import java.util.Scanner;

public class ColorChoose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first letter of the color: ");
        char firstLetter = scanner.next().charAt(0);
        String colorName = ChooseColor(firstLetter);

        if (colorName != null) {
            System.out.println("Full color name: " + colorName);
        } else {
            System.out.println("No color in database!");
        }

    }

    private static String ChooseColor(char letter) {
        return switch (Character.toUpperCase(letter)) {
            case 'R' -> "Red";
            case 'O' -> "Orange";
            case 'Y' -> "Yellow";
            case 'G' -> "Green";
            case 'B' -> "Blue";
            case 'V' -> "Violet";
            case 'P' -> "Pink";
            default -> null;
        };
    }
}
