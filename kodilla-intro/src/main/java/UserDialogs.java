import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("No color in database.");
            }
        }
    }

    public static double getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first color letter:");
        double val = scanner.nextDouble();    //int val = scanner.nextInt(); Nie pozwala na wprowadzenie liczb z miejscem po przecinku...
        return val;
    }
}