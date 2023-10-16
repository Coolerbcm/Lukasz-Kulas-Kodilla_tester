import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if (czyPrzestepny(rok)) {
            System.out.println(rok + " jest rokiem przestępnym.");
        } else {
            System.out.println(rok + " nie jest rokiem przestępnym.");
        }

        scanner.close();
    }

    public static boolean czyPrzestepny(int rok) {
        if (rok % 4 == 0) {
            if (rok % 100 != 0 || rok % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}