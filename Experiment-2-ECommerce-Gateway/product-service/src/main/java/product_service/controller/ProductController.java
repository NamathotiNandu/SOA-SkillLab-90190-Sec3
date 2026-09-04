package product_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import product_service.model.Product;
import product_service.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Value("${server.port}")
    private String port;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/instance")
    public String getInstance() {
        return "Product Service Instance running on port " + port;
    }
}