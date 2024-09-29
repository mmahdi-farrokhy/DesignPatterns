package Strategy.Discount.methods;

import Strategy.Delivery.Order;

import java.time.LocalDate;

public class RegistrationDiscount implements DiscountOffer {
    @Override
    public void applyDiscount(Order order) {
        if (LocalDate.now().getDayOfYear() - order.getUser().getRegistrationDate().getDayOfYear() < 31) {
            order.updatePrice(0.3 * order.getPrice());
        }
    }
}
