package eu.ciechanowiec.springstart.chapter8.ch8ex6.controllers;

import eu.ciechanowiec.springstart.chapter8.ch8ex6.model.Product;
import eu.ciechanowiec.springstart.chapter8.ch8ex6.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Herman Ciechanowiec
 */
@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public String viewProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "ch8ex5_products.html";
    }

    @PostMapping(path = "/products")
    public String addProduct(Product product,
                             Model model) {
        productService.addProduct(product);

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "ch8ex6_products.html";
    }
}
