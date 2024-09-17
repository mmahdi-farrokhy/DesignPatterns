package org.example.facade.order;

import java.util.List;

public class PlaceOrder {
    private StockService stockService;
    private CouponService couponService;

    public PlaceOrder(StockService stockService, CouponService couponService) {
        this.stockService = stockService;
        this.couponService = couponService;
    }

    public void place(Basket basket) {
        // check product stock
        basket.getItems().forEach(product -> {
            if (!stockService.exists(product)) {
                throw new Error(product.getTitle() + " does not exist");
            }
        });

        // check coupon
        if (!couponService.isValid(basket.getCoupon())) {
            throw new Error("Coupon " + basket.getCoupon() + " does not exist.");
        }

        // create order
        List<OrderLine> orderLines = basket.getItems().stream().map(item -> new OrderLine(item.getTitle(), item.getPrice(), 1)).toList();

        Order order = Order.create(1L, orderLines, basket.total(), basket.getCoupon());
    }
}
