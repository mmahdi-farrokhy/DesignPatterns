package Facade.Order;

public class OrderLine {
    private String title;
    private double price;
    private int quantity;

    public OrderLine(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
