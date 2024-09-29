package Builder.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderItem {
    private String name;
    private double price;
    private int quantity;
}
