package FlyWeight.Discount;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class Client {
    private DiscountFactory discountFactory;

    public void generateDiscount() {
        for (int i = 0; i < 100; i++) {
            discountFactory.createDiscount(
                    "discount-" + i,
                    i,
                    50,
                    100000,
                    500000,
                    2,
                    new Date());
        }
    }
}
