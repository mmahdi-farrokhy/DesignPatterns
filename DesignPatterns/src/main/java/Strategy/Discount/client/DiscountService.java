package Strategy.Discount.client;

import Strategy.Delivery.Order;
import Strategy.Discount.methods.DiscountOffer;

public class DiscountService {
    private DiscountOffer discountOffer;

    public DiscountService(DiscountOffer discountOffer) {
        this.discountOffer = discountOffer;
    }

    public void setDiscountOffer(DiscountOffer discountOffer) {
        this.discountOffer = discountOffer;
    }

    public void applyDiscount(Order order) {
        discountOffer.applyDiscount(order);
    }
}
