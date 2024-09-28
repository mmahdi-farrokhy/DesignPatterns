package strategy.discount;

import strategy.delivery.Order;

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
