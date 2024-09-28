package strategy.discount.methods;

import strategy.delivery.Order;

import java.time.LocalDate;

public class BirthdayDiscount implements DiscountOffer {
    @Override
    public void applyDiscount(Order order) {
        LocalDate today = LocalDate.now();

        if (Math.abs(today.getDayOfYear() - order.getUser().getBirthDate().getDayOfYear()) < 7) {
            order.updatePrice(0.5 * order.getPrice());
        }
    }
}
