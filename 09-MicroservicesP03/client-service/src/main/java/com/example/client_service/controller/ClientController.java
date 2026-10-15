package com.example.client_service.controller;


import com.example.client_service.client.MessageClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final MessageClient messageClient;

    public ClientController(MessageClient messageClient) {
        this.messageClient = messageClient;
    }

    @GetMapping("/message")
    public String getMessage() {
        return messageClient.getMessage();
    }
}