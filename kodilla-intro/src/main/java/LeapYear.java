public class LeapYear {
    public static void main(String[] args)
    {
        int year = 1990;
        if (LeapYear1(year))

        {
            System.out.print(year + " jest przestępny.");
        } else

        {
            System.out.print(year + " nie jest przestępny.");
        }
    }

    public static boolean LeapYear1(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}