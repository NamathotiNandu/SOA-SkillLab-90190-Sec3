package com.example.order_service.service;

import com.example.order_service.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    // GET - Return sample orders
    public List<Order> getOrders() {

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(
                101,
                1,
                List.of("Biryani", "Chicken 65")
        ));

        orders.add(new Order(
                102,
                2,
                List.of("Pizza", "Coke")
        ));

        orders.add(new Order(
                103,
                3,
                List.of("Burger", "French Fries")
        ));

        return orders;
    }

    // POST - Place order
    public String placeOrder(Order order) {

        return "Order placed successfully for User ID: "
                + order.getUserId()
                + ", Restaurant ID: "
                + order.getRestaurantId()
                + ", Items: "
                + order.getItems();
    }
}