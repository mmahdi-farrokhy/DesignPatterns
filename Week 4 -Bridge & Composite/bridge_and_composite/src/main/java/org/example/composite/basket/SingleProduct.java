package org.example.composite.basket;

public class SingleProduct implements BasketItem {
    private double price;

    public SingleProduct(double price) {
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }
}
