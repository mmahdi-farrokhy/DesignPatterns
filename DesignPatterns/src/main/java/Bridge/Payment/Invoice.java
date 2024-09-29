package Bridge.Payment;

public class Invoice {
    private String title;
    private double price;

    public Invoice(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
