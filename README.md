# 🚀 Spring Boot Learning Journey

This repository documents my journey of learning **Spring Boot, Java backend development, REST APIs, Spring Security, and Microservices** through hands-on projects.

My goal is to understand backend development step by step, strengthen my fundamentals, and build real-world projects using industry-relevant technologies.

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

- [x] Spring Boot Basics
- [x] Project Structure
- [x] REST APIs
- [x] Controller Layer
- [x] Service Layer
- [x] Repository Layer
- [x] CRUD Operations
- [x] Spring Data JPA
- [x] MySQL Integration
- [x] Exception Handling
- [x] Validation
- [x] DTOs
- [x] Spring Security Fundamentals
- [ ] JWT Authentication
- [ ] Testing
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
- [ ] Advanced JWT Authentication and Authorization

### 🌐 Microservices

- [x] Microservices Fundamentals
- [x] Multiple Spring Boot Applications
- [x] Service Registration and Discovery
- [x] Netflix Eureka Server
- [x] Eureka Clients
- [x] Inter-Service Communication using `RestTemplate`
- [x] `DiscoveryClient`
- [x] Spring Boot Admin
- [ ] API Gateway
- [ ] Load Balancing
- [ ] Centralized Configuration
- [ ] Fault Tolerance and Resilience
- [ ] Dockerizing Microservices
- [ ] Microservices Deployment

---

# 🛠️ Projects

## 1. SpringBootP01 — Spring Boot Fundamentals

My initial Spring Boot project, created to understand the fundamentals of backend development.

**Topics covered:**
- Spring Boot fundamentals
- REST API development
- Controller and service layers
- Dependency Injection
- Basic application structure

## 2. SpringBootP02 — Student Management REST API

A Student Management REST API developed to understand CRUD operations and layered architecture.

**Topics covered:**
- REST API development
- CRUD operations
- Controller layer
- Service layer
- Repository layer
- Exception handling

## 3. SpringBootP03 — Student Management with JPA

A Student Management application using Spring Data JPA and MySQL for database operations.

**Topics covered:**
- Spring Data JPA
- Entity mapping
- Repository interfaces
- MySQL integration
- Service layer
- Database operations
- Exception handling

## 4. LibraryManagementAPI — Library Management REST API

A backend REST API built using Java and Spring Boot for managing books in a library.

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
- DTO-to-Entity and Entity-to-DTO conversion
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

## 5. BookMyShowBE — Movie Ticket Booking Backend

A backend REST API inspired by a movie ticket booking platform. This project focuses on managing movies, theatres, shows, customers, seats, and bookings using Spring Boot.

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
- Profile management
- Custom exception handling
- Global API exception handling
- MySQL database integration

### Architecture

The project follows a layered architecture:

```text
Client
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

## 6. SpringSecurityP01 — Spring Security Fundamentals

A basic Spring Security project built to understand authentication, authorization, password encryption, and role-based access control.

### Features

- User registration
- Password encryption using BCrypt
- User authentication
- USER and ADMIN roles
- Role-based authorization
- Protected REST APIs
- Spring Security default login
- Authentication and authorization flow

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

## 7. MicroservicesP01 — Spring Boot Microservices

A beginner-friendly microservices project developed to understand how independent Spring Boot applications communicate with each other, discover services, and support application monitoring.

The project consists of four independent applications.

### Services Included

**1. Eureka Server — Port 8761**

- Acts as the service registry.
- Allows microservices to register themselves.
- Maintains information about registered service instances.
- Provides a dashboard to view registered services.

Dashboard: `http://localhost:8761`

**2. Hello Service — Port 8082**

- Provides a greeting REST API.
- Registers itself with Eureka Server.
- Responds to requests from other services.

Endpoint:

```http
GET http://localhost:8082/api/hello
```

Response:

```text
Hello from Hello Service!
```

**3. Welcome Service — Port 8081**

- Provides the Welcome REST API.
- Discovers Hello Service using Eureka and `DiscoveryClient`.
- Calls Hello Service using `RestTemplate`.
- Returns a combined welcome message.

Endpoint:

```http
GET http://localhost:8081/api/welcome
```

Response:

```text
Welcome! Hello from Hello Service!
```

**4. Spring Boot Admin Server — Port 8083**

- Provides a web dashboard for monitoring configured Spring Boot applications.
- Displays application information and available monitoring details.
- Uses Actuator-related information exposed by configured client applications.

### Architecture

```text
              Client / Postman
                     |
                     v
             Welcome Service
                Port 8081
                     |
                     | RestTemplate
                     | DiscoveryClient
                     v
              Hello Service
                Port 8082

          +----------------------+
          |     Eureka Server    |
          |       Port 8761      |
          | Registration and     |
          | Service Discovery    |
          +----------------------+

          +----------------------+
          | Spring Boot Admin    |
          |      Port 8083       |
          | Application Monitoring|
          +----------------------+
```

### Concepts Learned

- Microservices architecture
- Multiple independent Spring Boot applications
- Service registry and service discovery
- Netflix Eureka Server and Eureka Clients
- Inter-service REST communication
- `RestTemplate`
- `getForEntity()`
- `DiscoveryClient`
- Service names and application ports
- Basic application monitoring

### Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Cloud Netflix Eureka
- Spring Boot Admin
- Spring Boot Actuator
- `RestTemplate`
- `DiscoveryClient`
- Maven
- REST APIs
- Postman

---

## 🧰 Technologies and Tools

| Category | Technologies |
|---|---|
| Programming Language | Java 21 |
| Backend Framework | Spring Boot |
| Web Development | Spring Web, REST APIs |
| Database | MySQL |
| Persistence | Spring Data JPA |
| Security | Spring Security, BCrypt |
| Microservices | Spring Cloud Netflix Eureka |
| Monitoring | Spring Boot Admin, Actuator |
| Build Tool | Maven |
| API Testing | Postman |
| IDE | IntelliJ IDEA |
| Version Control | Git and GitHub |

## 🎯 Future Goals

- Complete JWT authentication and authorization.
- Learn automated testing with JUnit and Mockito.
- Understand API Gateway and load balancing.
- Learn centralized configuration and fault tolerance.
- Containerize Spring Boot applications using Docker.
- Deploy backend applications.
- Build a larger project using microservices architecture.

## 📈 My Learning Philosophy

I believe in learning by building projects, understanding how each component works internally, testing APIs, solving errors, and gradually moving from basic concepts to production-oriented backend development.

This repository will continue to evolve as I learn and implement new concepts.

---

⭐ **Thank you for visiting my Spring Boot Learning Journey!**
