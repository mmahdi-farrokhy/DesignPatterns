package Strategy.Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Order {
    private double price;
    private Customer customer;
}
