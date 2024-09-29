package Composite.Basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<BasketItem> items;

    public void addItem(BasketItem item) {
        if (items == null) {
            items = new ArrayList<>();
        }

        items.add(item);
    }

    public double totalPrice() {
        return items.stream()
                .mapToDouble(BasketItem::price)
                .sum();
    }
}
