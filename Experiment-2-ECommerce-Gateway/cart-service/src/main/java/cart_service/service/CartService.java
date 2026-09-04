package cart_service.service;

import cart_service.model.Cart;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CartService {

    public List<Cart> getCart() {

        return Arrays.asList(
            new Cart(1, 101, 2),
            new Cart(2, 102, 1),
            new Cart(3, 103, 3)
        );
    }
}