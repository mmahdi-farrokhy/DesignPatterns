package Proxy.CashedRepository;

import java.util.List;
import java.util.Optional;

public interface CacheInterface {
    Optional<List<Product>> get(String key);

    void set(String key, Object value);
}
