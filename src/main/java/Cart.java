package assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
@Primary
public class Cart {
    private List<Product> productInCart = new ArrayList<>();

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Long id) {
        productInCart.add(productRepository.findById(id));
    }

    public void removeProduct(Long id) {
        productInCart.remove(productRepository.findById(id));
    }

    @Override
    public String toString() {
        return "Products in your cart:" + productInCart;
    }

}
