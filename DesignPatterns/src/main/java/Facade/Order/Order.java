package Facade.Order;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private Long userId;
    private List<OrderLine> lines;
    private double total;
    private String coupon;

    public static Order create(Long userId, List<OrderLine> lines, double total, String coupon) {
        return new Order(userId, lines, total, coupon);
    }
}
