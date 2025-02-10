package Abstraction.Challenge;

abstract class ProductForSale {
    String type;
    Double price;
    String description;

    public ProductForSale(String type, Double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",quantity,price,type, description);
    }
    abstract void showDetails();
}
