package chain_of_responsibility.product;

public class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
