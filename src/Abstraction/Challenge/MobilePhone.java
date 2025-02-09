package Abstraction.Challenge;

public class MobilePhone extends ProductForSale{

    public MobilePhone(String type, Double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("This "+type+" is a elegant phone");
        System.out.printf("The price of the price is %6.2f %n",price);
        System.out.println(description);
    }
}
