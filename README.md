# 🚀 MicroservicesP03 — Load Balancing with OpenFeign

A hands-on Spring Boot microservices project demonstrating **service discovery, inter-service communication, and client-side load balancing** using Netflix Eureka, Spring Cloud OpenFeign, and Spring Cloud LoadBalancer.

This project is part of my **Spring Boot Learning Journey**, where I build practical projects to understand backend development and microservices step by step.

---

## 📌 Project Overview

In a microservices architecture, one service may run multiple instances to improve availability and distribute incoming requests.

This project demonstrates how a client service communicates with multiple instances of another service without hardcoding individual instance URLs.

### Objectives

- Understand microservices architecture.
- Implement service registration and discovery using Netflix Eureka.
- Communicate between services using OpenFeign.
- Run multiple instances of the same microservice.
- Implement client-side load balancing using Spring Cloud LoadBalancer.
- Discover service instances using Eureka.
- Observe how requests are routed to available service instances.
- Understand the request flow between independent Spring Boot applications.

---

## 🏗️ Architecture

The project contains three independent Spring Boot applications:

1. **Eureka Server** — Service registry.
2. **Message Service** — Runs two instances on different ports.
3. **Client Service** — Calls Message Service using OpenFeign.

```text
                    Client / Postman
                           |
                           v
                 +--------------------+
                 |   Client Service   |
                 |     Port 8080      |
                 +--------------------+
                           |
                           | OpenFeign
                           v
                 +--------------------+
                 | Spring Cloud       |
                 | LoadBalancer       |
                 +--------------------+
                           |
                    Selects instance
                       /       \
                      v         v
             +-------------+ +-------------+
             | Message     | | Message     |
             | Service     | | Service     |
             | Port: 8081  | | Port: 8082  |
             +-------------+ +-------------+
                      \         /
                       \       /
                        v     v
                 +--------------------+
                 |   Eureka Server    |
                 |     Port 8761      |
                 |  Service Registry  |
                 +--------------------+
```

**Important:** Eureka provides service discovery, OpenFeign provides declarative HTTP communication, and Spring Cloud LoadBalancer selects a service instance. These components work together to enable client-side load balancing.

---

## 📦 Applications Included

### 1. Eureka Server

**Port:** `8761`

Eureka Server acts as the central service registry.

**Responsibilities:**
- Registers and tracks available microservice instances.
- Allows services to discover other services by application name.
- Maintains information about registered instances.
- Provides a dashboard to inspect service registrations.

**Dashboard:**

`http://localhost:8761`

### 2. Message Service

**Ports:** `8081` and `8082`

Two instances of the same Spring Boot application run on different ports.

**Responsibilities:**
- Exposes a REST API that returns a message.
- Registers with Eureka.
- Uses the same application name for both instances.
- Provides multiple instances for load-balancing demonstrations.

**Instance configuration:**

| Instance | Port |
|---|---:|
| Message Service 1 | 8081 |
| Message Service 2 | 8082 |

Both instances must register under the same Eureka service name so that the client can discover either instance.

### 3. Client Service

**Port:** `8080`

Client Service provides an API that communicates with Message Service.

**Responsibilities:**
- Exposes a REST endpoint for clients.
- Uses OpenFeign to call Message Service.
- Uses the registered service name rather than hardcoding an instance URL.
- Integrates with Spring Cloud LoadBalancer to select an available instance.

---

## 🔄 How the Request Flow Works

Suppose a client sends a request to Client Service.

1. The client sends an HTTP request to Client Service.
2. Client Service invokes its OpenFeign client.
3. OpenFeign identifies the target service using its registered application name.
4. Spring Cloud LoadBalancer selects an available Message Service instance.
5. The request is sent to the selected instance.
6. Message Service processes the request and returns a response.
7. Client Service receives the response and returns it to the original client.

### Example flow

```text
Client / Postman
       |
       | HTTP Request
       v
Client Service :8080
       |
       | OpenFeign
       v
Spring Cloud LoadBalancer
       |
       | Selects an instance
       |
       +--------------------+
       |                    |
       v                    v
Message Service        Message Service
    :8081                  :8082
       |                    |
       +---------+----------+
                 |
                 v
          HTTP Response
                 |
                 v
          Client / Postman
```

Eureka maintains the service registry used for discovery. Spring Cloud LoadBalancer uses the available service instances to make its selection.

---

## ⚖️ What Is Client-Side Load Balancing?

Client-side load balancing means that the calling application selects which service instance should receive a request.

For example, instead of always calling:

```text
http://localhost:8081/api/message
```

the client calls the registered service by name through OpenFeign. Spring Cloud LoadBalancer then selects an available instance.

This makes it possible to run multiple instances of the same service without hardcoding each instance's URL in the client.

**Note:** Do not assume every consecutive request must alternate between ports `8081` and `8082`. The actual selection depends on the configured load-balancing strategy and the available instances.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Spring Boot 3.5.x | Application framework |
| Spring Cloud 2025.0.x | Microservices infrastructure |
| Spring Web | REST API development |
| Netflix Eureka Server | Service registry |
| Netflix Eureka Client | Service registration and discovery |
| Spring Cloud OpenFeign | Declarative HTTP client |
| Spring Cloud LoadBalancer | Client-side load balancing |
| Maven | Dependency management and build |
| IntelliJ IDEA | Development environment |
| Postman | API testing |
| Git and GitHub | Version control |

---

## 📁 Project Structure

```text
09-MicroservicesP03/
│
├── eureka-server/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── [Eureka Server application classes]
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── pom.xml
│   └── mvnw
│
├── message-service/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── [Message Service application classes]
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── pom.xml
│   └── mvnw
│
├── client-service/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── [Client Service application classes]
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── pom.xml
│   └── mvnw
│
└── README.md
```

Each application is an independent Spring Boot project with its own `pom.xml` and application configuration.

The Java package structure and class names are maintained within each application's source directory.

---

## ⚙️ Prerequisites

Before running the project, make sure you have:

- Java Development Kit (JDK) 21.
- IntelliJ IDEA or another Java IDE.
- Maven or the included Maven Wrapper.
- Postman or a browser for testing REST APIs.
- Ports `8080`, `8081`, `8082`, and `8761` available.

Check your Java installation:

```bash
java -version
```

---

## ▶️ How to Run the Project

Start the applications in the following order.

### Step 1: Start Eureka Server

Open the `eureka-server` project in IntelliJ IDEA and run its main application class.

Wait until the application starts successfully.

Open the dashboard:

`http://localhost:8761`

### Step 2: Start Message Service — Instance 1

Run the Message Service application with port `8081`.

Verify that the service registers with Eureka.

### Step 3: Start Message Service — Instance 2

Run another instance of the same Message Service application with port `8082`.

In IntelliJ IDEA, create a separate run configuration and add this program argument:

```text
--server.port=8082
```

Keep the first instance running on port `8081`.

Verify that Eureka displays the Message Service instances.

### Step 4: Start Client Service

Run the Client Service application on port `8080`.

Wait for the application to start and register with Eureka.

### Step 5: Test the Client API

Open Postman and send a `GET` request to the Client Service endpoint implemented in your controller.

For example, if your controller maps the endpoint to `/api/client/message`, the request would be:

```http
GET http://localhost:8080/api/client/message
```

**Use the actual mapping defined in your controller if it differs from this example.**

Check the response and application logs to identify which Message Service instance handled the request.

### Step 6: Observe Load Balancing

1. Keep both Message Service instances running.
2. Send multiple requests to Client Service.
3. Inspect the Message Service logs or response details.
4. Observe which instance receives each request.
5. Stop one instance and test again to explore how instance availability affects requests.

The last step is a useful experiment for understanding service-instance selection and the behavior of the current configuration.

---

## 🧪 Testing Checklist

Use this checklist while testing the project.

- [ ] Eureka Server starts successfully.
- [ ] Message Service instance on port `8081` starts.
- [ ] Message Service instance on port `8082` starts.
- [ ] Both instances register under the same service name.
- [ ] Client Service starts successfully.
- [ ] OpenFeign resolves the target service by its registered name.
- [ ] Client API returns a successful response.
- [ ] Multiple requests can be sent through Client Service.
- [ ] Instance selection can be observed through logs or response details.
- [ ] Behavior is tested after stopping one Message Service instance.

---

## 🧠 Key Concepts Learned

### Microservices Fundamentals
- Independent Spring Boot applications.
- Communication between services.
- Service boundaries and responsibilities.

### Service Discovery
- Netflix Eureka Server.
- Eureka Client registration.
- Discovering services by application name.
- Registered service instances.

### OpenFeign
- Declarative HTTP clients.
- Interface-based inter-service communication.
- Calling another microservice without manually writing repetitive HTTP client code.

### Load Balancing
- Client-side load balancing.
- Spring Cloud LoadBalancer.
- Multiple instances of the same microservice.
- Service-instance selection.
- The relationship between service discovery and load balancing.

### Practical Development
- Running multiple Spring Boot applications.
- Configuring different server ports.
- Testing REST APIs with Postman.
- Inspecting logs and debugging service communication.

---

## 🔍 OpenFeign vs. RestTemplate

| OpenFeign | RestTemplate |
|---|---|
| Declarative HTTP client | Imperative HTTP client |
| Uses interfaces and annotations | Uses methods such as `getForEntity()` |
| Reduces repetitive HTTP request code | Requires explicit request-handling code |
| Integrates with Spring Cloud LoadBalancer when configured | Requires suitable integration for service-name-based load balancing |

This project uses OpenFeign to practise declarative inter-service communication and Spring Cloud LoadBalancer for client-side instance selection.

`RestTemplate` is not used for the primary service-to-service communication in this project.

---

## 🚧 Project Scope

This project focuses on the fundamentals of Eureka, OpenFeign, and client-side load balancing.

The current scope does not include:

- Database integration.
- Authentication and authorization.
- Spring Cloud Gateway.
- Centralized configuration.
- Circuit breakers and retry policies.
- Distributed tracing.
- Docker-based deployment.
- Cloud deployment.

These can be explored in separate projects as the learning journey progresses.

---

## 🚀 Future Enhancements

Possible future improvements include:

- Centralized configuration using Spring Cloud Config.
- Fault tolerance using Resilience4j.
- Retry and timeout configuration.
- Circuit breaker implementation.
- Distributed tracing and structured logging.
- Containerization using Docker.
- Deployment of microservices to a cloud platform.
- Production-oriented monitoring and observability.

---

## 📚 Learning Journey

This project is part of my `spring-boot-learning` repository, which documents my practical journey through Java backend development, Spring Boot, Spring Security, REST APIs, and Microservices.

**GitHub Repository:** [spring-boot-learning](https://github.com/harshal-269/spring-boot-learning)

My approach is to learn by building projects, testing APIs, understanding internal request flows, debugging issues, and gradually moving toward production-oriented backend development.

---

⭐ **Thank you for visiting my Spring Boot Learning Journey!**
