package strategy.payment;

public class Order {
    private double price;
    private Customer customer;

    public Order(double price, Customer customer, double distance) {
        this.price = price;
        this.customer = customer;
        this.distance = distance;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }
}
