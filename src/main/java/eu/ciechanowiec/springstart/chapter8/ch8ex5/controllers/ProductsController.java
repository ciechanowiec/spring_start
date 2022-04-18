package eu.ciechanowiec.springstart.chapter8.ch8ex5.controllers;

import eu.ciechanowiec.springstart.chapter8.ch8ex5.model.Product;
import eu.ciechanowiec.springstart.chapter8.ch8ex5.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        return "productsch8ex5.html";
    }

    @PostMapping(path = "/products")
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {
        Product product = new Product(name, price);
        productService.addProduct(product);

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "productsch8ex5.html";
    }
}
