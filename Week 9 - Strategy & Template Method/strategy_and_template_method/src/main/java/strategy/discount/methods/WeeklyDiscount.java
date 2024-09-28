package strategy.discount.methods;

import strategy.delivery.Order;

public class WeeklyDiscount implements DiscountOffer {
    @Override
    public void applyDiscount(Order order) {
        order.updatePrice(order.getPrice() - (order.getUser().getWeeklyOrdersPrice() * 0.2));
    }
}
