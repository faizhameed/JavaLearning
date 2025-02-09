package Abstraction.Challenge;

import java.util.ArrayList;

public class Store {
    private ArrayList <ProductForSale> storeProducts = new ArrayList<>();
      public void addAnItemToTheOrder(ProductForSale newProduct){
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

}
