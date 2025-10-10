package poly.edu.asssof3022.service;

import org.springframework.stereotype.Service;
import poly.edu.asssof3022.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Laptop", 1500, 10));
        products.add(new Product(2L, "Mouse", 20, 50));
        products.add(new Product(3L, "Keyboard", 30, 30));
    }

    public List<Product> getAll() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }

    public void delete(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public Optional<Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
