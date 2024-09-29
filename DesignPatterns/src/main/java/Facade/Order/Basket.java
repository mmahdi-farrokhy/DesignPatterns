package Facade.Order;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
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

    public void applyCoupon(String coupon) {
        this.coupon = coupon;
    }
}
