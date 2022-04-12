package lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    @Qualifier("productInMemoryRepository")
    private Repository repository;

    public Product getProduct(Long id) {
        return repository.findById(id);
    }
}
