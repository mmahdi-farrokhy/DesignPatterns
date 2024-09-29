package Strategy.Discount.methods;

import Strategy.Delivery.Order;

public interface DiscountOffer {
    public void applyDiscount(Order order);
}
