public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkWeight(){
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        }
        else if (this.weight > 700 && this.weight <2000) {
            System.out.println("This notebook is not too heavy.");
        }
        else {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if(this.price >600 && this.price <=1000) {
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is expensive !");
        }
    }

    public void checkYear() {
        if (this.year < 2019) {
            System.out.println("This notebook is old.");
        } else if(this.year >2019 && this.year <=2020) {
            System.out.println("The price is not too old");
        }
        else {
            System.out.println("This notebook is brand new !");
        }
    }
}