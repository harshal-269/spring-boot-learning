package com.example.client_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "message-service")
public interface MessageClient {

    @GetMapping("/api/message")
    String getMessage();
}