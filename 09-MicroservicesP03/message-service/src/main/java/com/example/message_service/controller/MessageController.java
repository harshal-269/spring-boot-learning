package com.example.message_service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Value("${app.instance-id}")
    private String instanceId;

    @Value("${server.port}")
    private String port;

    @GetMapping
    public String getMessage() {
        return "Hello from Message Service - "
                + instanceId
                + " - Port "
                + port;
    }
}