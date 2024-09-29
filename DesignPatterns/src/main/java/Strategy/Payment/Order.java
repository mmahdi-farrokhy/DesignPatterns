package Strategy.Payment;

public class Order {
    private double price;
    private Customer customer;

    public Order(double price, Customer customer) {
        this.price = price;
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }
}
