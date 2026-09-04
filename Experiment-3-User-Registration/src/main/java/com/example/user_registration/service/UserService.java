package com.example.user_registration.service;

import com.example.user_registration.entity.User;
import com.example.user_registration.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(User user) {

        if (userRepository.existsByUsername(user.getUsername())) {
            return "Username already exists";
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            return "Email already exists";
        }

        userRepository.save(user);

        return "User registered successfully";
    }

    public String login(String username, String password) {

        User user = userRepository.findByUsername(username).orElse(null);

        if (user == null) {
            return "Invalid username or password";
        }

        if (!user.getPassword().equals(password)) {
            return "Invalid username or password";
        }

        return "Login successful";
    }
}