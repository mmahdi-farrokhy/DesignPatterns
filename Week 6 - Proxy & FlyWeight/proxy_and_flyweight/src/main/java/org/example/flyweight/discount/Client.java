package org.example.flyweight.discount;

import java.util.Date;

public class Client {
    private DiscountFactory discountFactory;

    public Client(DiscountFactory discountFactory) {
        this.discountFactory = discountFactory;
    }

    public void generateDiscount() {
        for (int i = 0; i < 100; i++) {
            discountFactory.createDiscount(
                    "discount-" + i,
                    i,
                    50,
                    100000,
                    500000,
                    2,
                    new Date());
        }
    }
}
