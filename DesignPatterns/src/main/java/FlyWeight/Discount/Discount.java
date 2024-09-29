package FlyWeight.Discount;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Discount {
    private String code;
    private int userId;
    private DiscountConstraints discountConstraints;
}
