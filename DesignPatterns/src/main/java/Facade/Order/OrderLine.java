package Facade.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderLine {
    private String title;
    private double price;
    private int quantity;
}
