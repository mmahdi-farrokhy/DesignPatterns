package strategy.discount.client;

import strategy.delivery.Order;
import strategy.discount.methods.DiscountOffer;

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
