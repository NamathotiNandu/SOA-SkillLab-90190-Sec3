package product_service.service;

import org.springframework.stereotype.Service;
import product_service.model.Product;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {

        return Arrays.asList(
            new Product(1, "Laptop", 55000),
            new Product(2, "Mobile Phone", 25000),
            new Product(3, "Headphones", 2000)
        );
    }
}