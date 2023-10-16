public class SimpleArray
{
    public static void main(String[] args)
    {
        String[] electronics = new String[] {"Varistor", "Mosfet Transistor", "Optocoupler", "Diode", "Relay"};
        String electronic = electronics[3];
        int numberOfElements = electronics.length;
        System.out.print("Moja tablica zawiera : " + numberOfElements + " elementów :)");
    }
}