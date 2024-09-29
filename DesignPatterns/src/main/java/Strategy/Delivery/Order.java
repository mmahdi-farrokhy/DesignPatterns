package Strategy.Delivery;

import Strategy.Discount.User;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Order {
    @NonNull
    private double price;
    @NonNull
    private User user;
    private double distance;

    public void updatePrice(double priceWithDiscount) {
        this.price = priceWithDiscount;
    }
}
