package org.example.facade.order;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> items = new ArrayList<>();
    private String coupon;

    public void addItems(Product item) {
        items.add(item);
    }

    public double total() {
        return items
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public List<Product> getItems() {
        return items;
    }

    public void applyCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getCoupon() {
        return coupon;
    }
}
