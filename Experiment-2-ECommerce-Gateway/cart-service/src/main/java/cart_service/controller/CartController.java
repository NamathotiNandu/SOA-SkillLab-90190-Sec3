package cart_service.controller;

import cart_service.model.Cart;
import cart_service.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart")
    public List<Cart> getCart() {
        return cartService.getCart();
    }
}