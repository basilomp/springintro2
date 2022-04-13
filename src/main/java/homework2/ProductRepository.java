package homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    @Autowired
    private Product product;
    private List<Product> productList;

    public Product findById(Long id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst().orElseThrow(RuntimeException::new);
    }

    public List<Product> findAll() {
        return productList;
    }

    @PostConstruct
    public void init() {
        productList = Arrays.asList(
                new Product(1L, "Chocolate bar", 99),
                new Product(2L, "Bacon-flavored crisps", 107),
                new Product(3L, "Sparkling water", 75),
                new Product(4L, "Canned tuna", 201),
                new Product(5L, "Instant coffee", 412)
        );
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productList=" + productList.toString() +
                '}';
    }
}
