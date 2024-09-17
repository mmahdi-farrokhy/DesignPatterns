package org.example.facade.order;

public class StockService {
    public boolean exists(Product product) {
        return product.getTitle().equals("Is available");
    }
}
