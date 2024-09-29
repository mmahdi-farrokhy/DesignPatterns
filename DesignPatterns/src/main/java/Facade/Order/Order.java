package Facade.Order;

import java.util.List;

public class Order {
    private Long userId;
    private List<OrderLine> lines;
    private double total;
    private String coupon;

    private Order(Long userId, List<OrderLine> lines, double total, String coupon) {
        this.userId = userId;
        this.lines = lines;
        this.total = total;
        this.coupon = coupon;
    }

    public static Order create(Long userId, List<OrderLine> lines, double total, String coupon) {
        return new Order(userId, lines, total, coupon);
    }
}
