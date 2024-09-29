package Composite.Basket;

import java.util.List;

public class ProductPackage implements BasketItem {
    private List<BasketItem> items;

    public ProductPackage(List<BasketItem> items) {
        this.items = items;
    }

    @Override
    public double price() {
        return items.stream()
                .mapToDouble(BasketItem::price)
                .sum();
    }
}
