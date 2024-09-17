package org.example.proxy.cache.cashedrepository;

import java.util.List;
import java.util.Optional;

public class CachedProductRepository implements ProductRepositoryInterface {
    private final ProductRepositoryInterface productRepository;
    private final CacheInterface cache;

    public CachedProductRepository(ProductRepositoryInterface productRepository, CacheInterface cache) {
        this.productRepository = productRepository;
        this.cache = cache;
    }

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
