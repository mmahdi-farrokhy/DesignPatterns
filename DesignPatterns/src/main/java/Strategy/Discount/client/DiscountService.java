package Strategy.Discount.client;

import Strategy.Delivery.Order;
import Strategy.Discount.methods.DiscountOffer;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class DiscountService {
    private DiscountOffer discountOffer;

    public void applyDiscount(Order order) {
        discountOffer.applyDiscount(order);
    }
}
