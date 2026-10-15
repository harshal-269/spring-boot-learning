# 🚀 Spring Boot Learning Journey

Welcome to my **Spring Boot Learning Journey** repository!

This repository documents my practical journey of learning **Java backend development, Spring Boot, REST APIs, Spring Security, JWT authentication, and Microservices** by building projects from fundamentals to more advanced concepts.

My goal is to strengthen my backend development skills, understand how applications work internally, and gradually build scalable, production-oriented applications using industry-relevant technologies.

---

## 📚 Learning Roadmap

### 🌱 Spring Core

- [x] Inversion of Control (IoC)
- [x] Dependency Injection
- [x] Constructor Injection
- [x] Setter Injection
- [x] `@Autowired`
- [x] `@Qualifier`
- [x] `@Primary`
- [x] `@Component`
- [x] `@Service`
- [x] `@Configuration`
- [x] `@Bean`

### ⚙️ Spring Boot

- [x] Spring Boot Fundamentals
- [x] Project Structure
- [x] REST API Development
- [x] Controller Layer
- [x] Service Layer
- [x] Repository Layer
- [x] CRUD Operations
- [x] Spring Data JPA
- [x] MySQL Integration
- [x] Validation
- [x] DTOs
- [x] Global Exception Handling
- [ ] Automated Testing
- [ ] Docker
- [ ] Deployment

### 🔐 Spring Security

- [x] Authentication Fundamentals
- [x] Authorization Fundamentals
- [x] Password Encryption using BCrypt
- [x] `UserDetailsService`
- [x] `SecurityFilterChain`
- [x] Role-Based Authorization
- [x] Protected REST APIs
- [x] JWT Authentication Practice
- [ ] Advanced Security Concepts

### 🌐 Microservices

- [x] Microservices Fundamentals
- [x] Multiple Independent Spring Boot Applications
- [x] Netflix Eureka Server
- [x] Service Registration and Discovery
- [x] Inter-Service Communication using `RestTemplate`
- [x] `DiscoveryClient`
- [x] Inter-Service Communication using OpenFeign
- [x] Spring Cloud Gateway
- [x] Spring Boot Admin
- [x] Spring Boot Actuator
- [x] Client-Side Load Balancing Practice
- [ ] Centralized Configuration
- [ ] Fault Tolerance and Resilience
- [ ] Dockerizing Microservices
- [ ] Microservices Deployment

---

# 🛠️ Projects

## 01. SpringBootP01 — Spring Boot Fundamentals

**Folder:** `01-SpringBootP01`

My first Spring Boot project, created to understand the fundamentals of backend development and the structure of a Spring Boot application.

### Topics Covered

- Spring Boot fundamentals
- REST API development
- Controller and service layers
- Dependency Injection
- Basic application structure

### Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven

---

## 02. SpringBootP02 — Student Management REST API

**Folder:** `02-SpringBootP02`

A Student Management REST API developed to understand CRUD operations and layered architecture in Spring Boot.

### Topics Covered

- REST API development
- CRUD operations
- Controller layer
- Service layer
- Repository layer
- Exception handling
- Separation of responsibilities

### Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven

---

## 03. SpringBootP03 — Student Management with JPA

**Folder:** `03-SpringBootP03`

A Student Management application using Spring Data JPA and MySQL to perform database operations.

### Topics Covered

- Spring Data JPA
- Entity mapping
- Repository interfaces
- MySQL integration
- Service layer
- Database operations
- Exception handling

### Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 04. LibraryManagementAPI — Library Management REST API

**Folder:** `04-LibraryManagementAPI`

A backend REST API for managing library books. This project focuses on building maintainable APIs using DTOs, validation, exception handling, and database integration.

### Features

- Create a new book
- Retrieve all books
- Retrieve a book by ID
- Update book details
- Delete a book
- Request validation
- Custom `BookNotFoundException`
- Global exception handling
- Request DTO and Response DTO
- DTO-to-Entity conversion
- Entity-to-DTO conversion
- MySQL database integration

### Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Jakarta Validation
- Maven
- Postman

---

## 05. BookMyShowBE — Movie Ticket Booking Backend

**Folder:** `05-BookMyShowBE`

A backend REST API inspired by a movie ticket booking platform. This project focuses on managing movies, theatres, shows, customers, seats, and bookings.

### Features

- Movie management
- Theatre management
- Show management
- Customer profiles
- Show seat management
- Movie and theatre APIs
- Show APIs
- Seat availability handling
- Movie ticket booking
- Booking response handling
- Booking cancellation workflow
- Profile management
- Custom exception handling
- Global API exception handling
- MySQL database integration

### Architecture

```text
Client / Postman
       |
       v
   Controller
       |
       v
    Service
       |
       v
   Repository
       |
       v
  MySQL Database
```

### Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- REST APIs
- Postman

---

## 06. SpringSecurityP01 — Spring Security Fundamentals

**Folder:** `06-SpringSecrityP01`

A Spring Security project developed to understand authentication, authorization, password encryption, and role-based access control.

### Features

- User registration
- Password encryption using BCrypt
- User authentication
- USER and ADMIN roles
- Role-based authorization
- Protected REST APIs
- Spring Security login flow
- Authentication and authorization handling

### Concepts Learned

- `PasswordEncoder`
- `BCryptPasswordEncoder`
- `UserDetailsService`
- `SecurityFilterChain`
- Authentication
- Authorization
- Role-Based Access Control (RBAC)
- Protected endpoints
- HTTP 401 Unauthorized
- HTTP 403 Forbidden

### Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven
- Postman

---

## 07. MicroservicesP01 — Eureka and RestTemplate

**Folder:** `07-MicroservicesP01`

A beginner-friendly microservices project developed to understand service discovery and communication between independent Spring Boot applications.

### Applications Included

**1. Eureka Server — Port 8761**

- Acts as the service registry.
- Allows microservices to register themselves.
- Maintains information about registered service instances.
- Provides a dashboard to view registered services.

Dashboard: `http://localhost:8761`

**2. Hello Service — Port 8082**

- Provides a greeting REST API.
- Registers itself with Eureka.
- Responds to requests from other services.

Example endpoint:

```http
GET http://localhost:8082/api/hello
```

**3. Welcome Service — Port 8081**

- Provides a Welcome REST API.
- Discovers Hello Service using Eureka and `DiscoveryClient`.
- Calls Hello Service using `RestTemplate`.
- Returns a combined welcome message.

Example endpoint:

```http
GET http://localhost:8081/api/welcome
```

**4. Spring Boot Admin Server — Port 8083**

- Provides an application monitoring dashboard.
- Displays configured Spring Boot applications.
- Uses Actuator information exposed by client applications.

### Architecture

```text
Client / Postman
       |
       v
Welcome Service :8081
       |
       | RestTemplate
       | DiscoveryClient
       v
Hello Service :8082

Eureka Server :8761
Service Registry

Spring Boot Admin :8083
Application Monitoring
```

### Concepts Learned

- Microservices architecture
- Independent Spring Boot applications
- Netflix Eureka Server and Eureka Clients
- Service registration and discovery
- Inter-service REST communication
- `RestTemplate`
- `getForEntity()`
- `DiscoveryClient`
- Application monitoring

### Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Cloud Netflix Eureka
- Spring Boot Admin
- Spring Boot Actuator
- RestTemplate
- DiscoveryClient
- Maven
- Postman

---

## 08. MicroservicesP02 — Student Management Microservices

**Folder:** `08-MicroservicesP02`

A microservices project developed to understand how multiple Spring Boot applications communicate using service discovery, OpenFeign, and an API Gateway.

The project uses in-memory sample data rather than a database, keeping the focus on microservices fundamentals.

### Applications Included

**1. Eureka Server — Port 8761**

- Acts as the central service registry.
- Registers microservices.
- Enables discovery by application name.
- Provides a dashboard for inspecting registered instances.

Dashboard: `http://localhost:8761`

**2. Spring Boot Admin Server — Port 9090**

- Provides an application monitoring dashboard.
- Monitors registered client applications.
- Displays application health and monitoring information.
- Uses Actuator endpoints exposed by the applications.

Dashboard: `http://localhost:9090`

**3. Student Service — Port 8081**

- Provides Student REST APIs.
- Returns all students and individual student details.
- Maintains sample student data in memory.
- Uses OpenFeign to retrieve course information from Course Service.
- Registers with Eureka and Spring Boot Admin.

Example endpoints:

```http
GET http://localhost:8081/api/students
GET http://localhost:8081/api/students/1
GET http://localhost:8081/api/students/1/course
```

**4. Course Service — Port 8082**

- Provides Course REST APIs.
- Returns all courses and individual course details.
- Maintains sample course data in memory.
- Registers with Eureka and Spring Boot Admin.

Example endpoints:

```http
GET http://localhost:8082/api/courses
GET http://localhost:8082/api/courses/101
```

**5. API Gateway — Port 8085**

- Provides a single entry point for Student and Course APIs.
- Routes Student requests to Student Service.
- Routes Course requests to Course Service.
- Uses service discovery and Spring Cloud LoadBalancer for service destinations.
- Exposes Actuator endpoints for health monitoring.

Port `8085` is used because port `8080` was already occupied in the development environment.

Example endpoints:

```http
GET http://localhost:8085/api/students
GET http://localhost:8085/api/students/1/course
GET http://localhost:8085/api/courses
```

### Architecture

```text
                 Client / Postman
                        |
                        v
                  API Gateway
                   Port 8085
                    /      \
                   v        v
          Student Service  Course Service
             Port 8081       Port 8082
                   \          /
                    \ OpenFeign
                     \      /
                      v    v
                 Course Details

              +--------------------+
              |    Eureka Server   |
              |      Port 8761     |
              +--------------------+

              +--------------------+
              |    Admin Server    |
              |      Port 9090     |
              +--------------------+
```

### Example Inter-Service Communication

When a client requests:

```http
GET http://localhost:8085/api/students/1/course
```

The request flow is:

1. API Gateway receives the request.
2. Gateway routes the request to Student Service.
3. Student Service retrieves the requested student and their `courseId`.
4. OpenFeign calls Course Service to retrieve the corresponding course.
5. Student Service combines the student and course information.
6. The response returns through API Gateway.

Example response:

```json
{
  "student": {
    "id": 1,
    "name": "Harshal",
    "email": "harshal@example.com",
    "courseId": 101
  },
  "course": {
    "id": 101,
    "name": "Java Programming",
    "instructor": "Rahul Sharma",
    "durationInWeeks": 8
  }
}
```

### Concepts Learned

- Independent Spring Boot applications
- Netflix Eureka service registration and discovery
- OpenFeign declarative HTTP clients
- Inter-service communication
- Spring Cloud Gateway routing
- Service-name-based destination resolution
- Spring Cloud LoadBalancer
- Spring Boot Admin
- Spring Boot Actuator
- Health and metrics endpoints
- API testing using Postman

### Technologies Used

- Java 21
- Spring Boot 3.5.x
- Spring Cloud 2025.0.x
- Spring Web
- Spring Cloud Netflix Eureka
- Spring Cloud OpenFeign
- Spring Cloud Gateway
- Spring Cloud LoadBalancer
- Spring Boot Admin
- Spring Boot Actuator
- Maven
- Postman

### Design Decisions

- No database or Spring Data JPA.
- No authentication or authorization.
- No Kafka or messaging infrastructure.
- No Docker or Config Server.
- Sample data is maintained in memory.
- Each application is independently runnable.
- The project focuses on service discovery, communication, routing, and monitoring.

---

## 09. MicroservicesP03 — Load Balancing with OpenFeign

**Folder:** `09-MicroservicesP03`

A hands-on microservices project demonstrating **client-side load balancing** using Netflix Eureka, Spring Cloud OpenFeign, and Spring Cloud LoadBalancer.

This project builds on the previous microservices projects by running multiple instances of the same service and allowing a client to communicate with them through a service name.

### Project Objectives

- Understand client-side load balancing.
- Register multiple instances of the same microservice with Eureka.
- Communicate with another microservice using OpenFeign.
- Use Spring Cloud LoadBalancer to select a service instance.
- Avoid hardcoding individual service instance URLs.
- Observe how requests are handled by multiple instances.

### Applications Included

**1. Eureka Server — Port 8761**

- Acts as the service registry.
- Maintains information about registered instances.
- Enables service discovery.
- Provides a dashboard for inspecting registrations.

Dashboard: `http://localhost:8761`

**2. Message Service — Port 8081**

- Exposes a REST API that returns a message.
- Registers with Eureka.
- Provides the first service instance.

**3. Message Service — Port 8082**

- Runs another instance of the same Message Service application.
- Registers using the same application name.
- Provides a second instance for load-balancing experiments.

**4. Client Service — Port 8080**

- Exposes a REST API for clients.
- Uses OpenFeign to call Message Service.
- Uses the registered service name instead of hardcoding an instance URL.
- Integrates with Spring Cloud LoadBalancer to select an available instance.

### Architecture

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
                    Selects an instance
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
                 +--------------------+
```

### How It Works

1. Start Eureka Server.
2. Start Message Service on port `8081`.
3. Start another Message Service instance on port `8082`.
4. Both instances register with Eureka under the same service name.
5. Start Client Service on port `8080`.
6. Send a request to Client Service.
7. OpenFeign calls Message Service by its registered name.
8. Spring Cloud LoadBalancer selects an available instance.
9. The selected instance processes the request.
10. The response returns to the client.

### Key Concepts Learned

- Client-side load balancing
- Netflix Eureka service discovery
- OpenFeign declarative HTTP communication
- Spring Cloud LoadBalancer integration
- Multiple instances of the same microservice
- Service-name-based communication
- Running independent Spring Boot applications
- Observing instance selection through logs and responses

### Technologies Used

- Java 21
- Spring Boot 3.5.x
- Spring Cloud 2025.0.x
- Spring Web
- Netflix Eureka Server
- Netflix Eureka Client
- Spring Cloud OpenFeign
- Spring Cloud LoadBalancer
- Maven
- IntelliJ IDEA
- Postman

### Testing

- [ ] Start Eureka Server successfully.
- [ ] Start Message Service on port `8081`.
- [ ] Start Message Service on port `8082`.
- [ ] Verify both instances register with Eureka.
- [ ] Start Client Service on port `8080`.
- [ ] Send requests through Client Service.
- [ ] Inspect logs to identify which instance handles requests.
- [ ] Test behavior after stopping one Message Service instance.

**Important:** Consecutive requests are not guaranteed to alternate between the two instances. The behavior depends on the configured load-balancing strategy and the available instances.

---

# 🧰 Technologies and Tools

| Category | Technologies |
|---|---|
| Programming Language | Java 21 |
| Backend Framework | Spring Boot |
| Web Development | Spring Web, REST APIs |
| Persistence | Spring Data JPA |
| Database | MySQL |
| Security | Spring Security, BCrypt, JWT |
| Service Discovery | Netflix Eureka |
| Inter-Service Communication | RestTemplate, OpenFeign |
| API Routing | Spring Cloud Gateway |
| Load Balancing | Spring Cloud LoadBalancer |
| Monitoring | Spring Boot Admin, Actuator |
| Build Tool | Maven |
| API Testing | Postman |
| IDE | IntelliJ IDEA |
| Version Control | Git and GitHub |

---

# 🎯 Future Learning Goals

- Practise automated testing with JUnit and Mockito.
- Explore advanced JWT authentication and authorization.
- Learn centralized configuration using Spring Cloud Config.
- Implement fault tolerance and resilience using Resilience4j.
- Explore timeouts, retries, and circuit breakers.
- Improve logging and distributed tracing.
- Containerize applications using Docker.
- Deploy Spring Boot applications.
- Build larger applications using microservices architecture.

---

# 📈 My Learning Philosophy

I believe in learning by building projects, understanding how each component works internally, testing APIs, debugging errors, and gradually progressing from fundamental concepts to production-oriented backend development.

Each project in this repository represents a step in my journey toward becoming a stronger Java backend developer.

This repository will continue to evolve as I learn and implement new concepts.

---

⭐ **Thank you for visiting my Spring Boot Learning Journey!**

**GitHub Repository:** [spring-boot-learning](https://github.com/harshal-269/spring-boot-learning)
