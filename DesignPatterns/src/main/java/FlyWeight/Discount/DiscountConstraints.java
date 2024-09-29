package FlyWeight.Discount;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class DiscountConstraints {
    private double percentage;
    private double minAmount;
    private double maxAmount;
    private int limit;
    private Date expireDate;
}
