package strategy.discount;

import strategy.delivery.Order;

public interface DiscountOffer {
    public void applyDiscount(Order order);
}
