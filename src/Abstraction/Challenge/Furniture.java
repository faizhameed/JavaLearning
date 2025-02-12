package Abstraction.Challenge;

public class Furniture extends ProductForSale{
    public Furniture(String type, Double price, String description) {
        super(type, price, description);
    }
    @Override
    void showDetails() {
        System.out.println("Furniture: "+type);
        System.out.printf("The price is $%6.2f %n",price);
        System.out.println(description);
    }
}







