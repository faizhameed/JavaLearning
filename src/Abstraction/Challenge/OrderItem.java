package Abstraction.Challenge;

public record OrderItem(int quantity,ProductForSale product) {
    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }
}
