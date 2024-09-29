package Proxy.CashedRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class CachedProductRepository implements ProductRepositoryInterface {
    private final ProductRepositoryInterface productRepository;
    private final CacheInterface cache;

    @Override
    public List<Product> all() {
        Optional<List<Product>> products = cache.get("key");

        if (products.isPresent()) {
            return products.get();
        }

        List<Product> allProducts = productRepository.all();
        cache.set("products", products);

        return allProducts;
    }
}
