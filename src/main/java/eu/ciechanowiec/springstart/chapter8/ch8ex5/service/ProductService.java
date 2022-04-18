package eu.ciechanowiec.springstart.chapter8.ch8ex5.service;

import eu.ciechanowiec.springstart.chapter8.ch8ex5.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product productToAdd) {
        products.add(productToAdd);
    }

    public List<Product> findAll() {
        return products.stream().toList();
    }
}
