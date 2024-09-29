package Builder.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Order {
    private String customer;
    private double totalPrice;
    private double finalPrice;
    private Date createdAt;
    private String deliveryAddress;
    private String status;
    private List<OrderItem> items;

    public void cancel() {
        this.status = "cancelled";
    }
}
