package strategy.discount.methods;

import strategy.delivery.Order;

public class MonthlyDiscount implements DiscountOffer {
    @Override
    public void applyDiscount(Order order) {
        order.updatePrice(order.getPrice() - (order.getUser().getMonthlyOrdersPrice() * 0.1));
    }
}
