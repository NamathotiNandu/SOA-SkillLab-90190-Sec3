package com.example.user_registration.controller;

import com.example.user_registration.dto.LoginRequest;
import com.example.user_registration.entity.User;
import com.example.user_registration.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @Valid @RequestBody User user) {

        String result = userService.register(user);

        if (result.equals("Username already exists") ||
            result.equals("Email already exists")) {

            return ResponseEntity.badRequest().body(result);
        }

        return ResponseEntity.ok(result);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @Valid @RequestBody LoginRequest request) {

        String result = userService.login(
                request.getUsername(),
                request.getPassword()
        );

        if (result.equals("Invalid username or password")) {
            return ResponseEntity.badRequest().body(result);
        }

        return ResponseEntity.ok(result);
    }
}