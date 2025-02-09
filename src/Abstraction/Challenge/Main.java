package Abstraction.Challenge;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addAnItemToTheOrder(new MobilePhone("Samsung",1299.00,"This is a quality phone"));
        store.addAnItemToTheOrder(new MobilePhone("Iphone",1899.00,"Iphone with dynamic Island!"));

        store.listProducts();
    }
}
