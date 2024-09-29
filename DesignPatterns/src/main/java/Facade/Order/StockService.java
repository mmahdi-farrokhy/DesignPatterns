package Facade.Order;

public class StockService {
    public boolean exists(Product product) {
        return product.getTitle().equals("Is available");
    }
}
