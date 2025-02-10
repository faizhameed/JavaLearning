package Abstraction.Challenge;

import java.util.ArrayList;

public class Store {
    private ArrayList <ProductForSale> storeProducts = new ArrayList<>();
      public void addAnItem(ProductForSale newProduct){
          boolean add = storeProducts.add(newProduct);
          if(add){
              System.out.println("Product added successfully!");
          }
      }
      public  void listProducts(){
          for(var item: this.storeProducts){
              System.out.println("_".repeat(30));
              item.showDetails();
          }
      }
      public  void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
          order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
      }

    public void printOrder(ArrayList<OrderItem> order){
          double salesTotal = 0;
          for(var item:order){
              item.product().printPricedItem(item.quantity());
              salesTotal+=item.product().getSalesPrice(item.quantity());
          }
        System.out.printf("Sales Total = $%6.2f %n",salesTotal);
    }
}
