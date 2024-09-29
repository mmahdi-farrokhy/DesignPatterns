package Composite.Basket;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductPackage implements BasketItem {
    private List<BasketItem> items;

    @Override
    public double price() {
        return items.stream()
                .mapToDouble(BasketItem::price)
                .sum();
    }
}
