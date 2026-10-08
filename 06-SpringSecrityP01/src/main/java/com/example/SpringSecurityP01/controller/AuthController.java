package com.example.SpringSecurityP01.controller;

import com.example.SpringSecurityP01.model.User;
import com.example.SpringSecurityP01.service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {

        return userService.register(user);
    }
}