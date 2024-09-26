package observer.product;

public class Client {

    public void updatePrice() {
        Product product = new Product(1000000);
        product.attach("price-" + product.getPrice(), new ProductPriceObserver());
        product.changePrice(2000000);
    }
}
