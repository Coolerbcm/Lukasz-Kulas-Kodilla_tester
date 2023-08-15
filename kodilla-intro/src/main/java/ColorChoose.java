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

    public static String ChooseColor(char letter) {
        switch (Character.toUpperCase(letter)) {
            case 'R': return "Red";
            case 'O': return "Orange";
            case 'Y': return "Yellow";
            case 'G': return "Green";
            case 'B': return "Blue";
            case 'V': return "Violet";
            case 'P': return "Pink";
            default: return null;
        }
    }
}
