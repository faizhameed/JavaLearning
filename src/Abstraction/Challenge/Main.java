package Abstraction.Challenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addAnItem(new MobilePhone("Samsung",1299.00,"This is a quality phone"));
        store.addAnItem(new MobilePhone("Iphone",1899.00,"Iphone with dynamic Island!"));
        store.addAnItem(new Furniture("Chair",200.00,"Wooden with seat cover"));
        store.addAnItem(new Furniture("Table",500.00,"Table 1500cms x 750cms"));

        store.listProducts();
        var order =  new ArrayList<OrderItem>();
        store.addItemToOrder(order,1,3);
        store.addItemToOrder(order,0,1);
        store.addItemToOrder(order,2,6);
        store.addItemToOrder(order,3,1);
        store.printOrder(order);
    }
}
