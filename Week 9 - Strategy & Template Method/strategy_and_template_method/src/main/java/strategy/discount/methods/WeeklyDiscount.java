package strategy.discount.methods;

import strategy.delivery.Order;
import strategy.discount.DiscountOffer;

public class WeeklyDiscount implements DiscountOffer {
    @Override
    public void applyDiscount(Order order) {
        order.updatePrice(order.getPrice() - (order.getUser().getWeeklyOrdersPrice() * 0.2));
    }
}
