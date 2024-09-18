package org.example.flyweight.discount;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DiscountFactory {
    private Map<String, DiscountConstraints> constraints = new HashMap<>();

    public Discount createDiscount(
            String code,
            int userId,
            double percentage,
            double minAmount,
            double maxAmount,
            int limit,
            Date expireDate) {
        DiscountConstraints discountConstraints = createDiscountConstraints(percentage, minAmount, maxAmount, limit, expireDate);
        return new Discount(code, userId, discountConstraints);
    }

    private DiscountConstraints createDiscountConstraints(double percentage, double minAmount, double maxAmount, int limit, Date expireDate) {
        String constraintKey = createConstraintKey(percentage, minAmount, maxAmount, limit, expireDate);

        if (!constraints.containsKey(constraintKey)) {
            constraints.put(constraintKey, new DiscountConstraints(percentage, minAmount, maxAmount, limit, expireDate));
        }

        return constraints.get(constraintKey);
    }

    private String createConstraintKey(
            double percentage,
            double minAmount,
            double maxAmount,
            int limit,
            Date expireDate) {
        String constraintParameters =
                percentage +
                        minAmount +
                        maxAmount +
                        limit +
                        expireDate.toString();

        return String.valueOf(constraintParameters.hashCode());
    }
}
