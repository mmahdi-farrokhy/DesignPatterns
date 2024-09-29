package Strategy.Discount.methods;

import Strategy.Delivery.Order;

public class MonthlyDiscount implements DiscountOffer {
    @Override
    public void applyDiscount(Order order) {
        order.updatePrice(order.getPrice() - (order.getUser().getMonthlyOrdersPrice() * 0.1));
    }
}
