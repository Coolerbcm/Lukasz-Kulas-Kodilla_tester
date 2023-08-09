public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println();
        System.out.println(notebook.weight + "g " + notebook.price + "$" + " " +  notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
        System.out.println();
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + "$" + " " +  heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        System.out.println();
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + "$" + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();

    }
}