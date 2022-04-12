package lesson2;

public class SecondRepository implements Repository{

    @Override
    public Product findById(Long id) {
        return new Product("testTitle", 1L, 10);
    }
}
