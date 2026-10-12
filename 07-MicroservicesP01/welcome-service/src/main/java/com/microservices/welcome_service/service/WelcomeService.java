package com.microservices.welcome_service.service;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeService {

    private final RestTemplate restTemplate;
    private final DiscoveryClient discoveryClient;

    public WelcomeService(
            RestTemplate restTemplate,
            DiscoveryClient discoveryClient) {

        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
    }

    public String getWelcomeMessage() {

        List<ServiceInstance> instances =
                discoveryClient.getInstances("hello-service");

        if (instances.isEmpty()) {
            throw new IllegalStateException(
                    "Hello Service is not registered with Eureka"
            );
        }

        ServiceInstance instance = instances.get(0);

        URI helloServiceUri = instance.getUri()
                .resolve("/api/hello");

        String helloMessage = restTemplate.getForEntity(
                helloServiceUri,
                String.class
        ).getBody();

        return "Welcome! " + helloMessage;
    }
}