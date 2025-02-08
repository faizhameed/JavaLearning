package Abstraction.Challenge;

public class ProductForSale {
    String type;
    Double price;
    String Description;

    public ProductForSale(String type, Double price, String description) {
        this.type = type;
        this.price = price;
        Description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%s %3.0f %6.2f %n", type, price, getSalesPrice(quantity));
    }
}
