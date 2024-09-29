package Composite.Basket;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SingleProduct implements BasketItem {
    private double price;

    @Override
    public double price() {
        return price;
    }
}
