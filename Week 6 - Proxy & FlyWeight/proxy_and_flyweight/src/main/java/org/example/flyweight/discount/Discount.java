package org.example.flyweight.discount;

import java.util.Date;

public class Discount {
    private String code;
    private int userId;
    private DiscountConstraints discountConstraints;

    public Discount(String code, int userId, DiscountConstraints discountConstraints) {
        this.code = code;
        this.userId = userId;
        this.discountConstraints = discountConstraints;
    }

    public String getCode() {
        return code;
    }

    public int getUserId() {
        return userId;
    }

    public DiscountConstraints getDiscountConstraints() {
        return discountConstraints;
    }
}
