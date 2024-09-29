package Strategy.Delivery;

import Strategy.Discount.User;

public class Order {
    private double price;
    private double distance;
    private User user;

    public Order(double price, User user) {
        this.price = price;
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public double getDistance() {
        return distance;
    }

    public User getUser() {
        return user;
    }

    public void updatePrice(double priceWithDiscount) {
        this.price = priceWithDiscount;
    }
}
