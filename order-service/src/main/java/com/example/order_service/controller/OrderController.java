package com.example.order_service.controller;

import com.example.order_service.model.Order;
import com.example.order_service.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // GET - Display sample orders in browser
    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    // POST - Place a new order
    @PostMapping
    public String placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }
}