package com.example.restaurant_service.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restaurant_service.model.Restaurant;

@Service
public class RestaurantService {

    public List<Restaurant> getRestaurants() {

        return Arrays.asList(
            new Restaurant(1, "Paradise Restaurant", "Vijayawada"),
            new Restaurant(2, "Bawarchi Restaurant", "Hyderabad"),
            new Restaurant(3, "Mehfil Restaurant", "Guntur")
        );
    }
}