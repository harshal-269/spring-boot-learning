# 🚀 Spring Boot Learning Journey

This repository documents my journey of learning **Java backend development, Spring Boot, REST APIs, Spring Security, and Microservices** through hands-on projects.

My goal is to strengthen my backend fundamentals, understand how real-world applications work internally, and gradually build scalable applications using industry-relevant technologies.

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
- [x] JWT Authentication and Authorization Practice
- [ ] Advanced Security Concepts

### 🌐 Microservices

- [x] Microservices Fundamentals
- [x] Multiple Independent Spring Boot Applications
- [x] Service Registration and Discovery
- [x] Netflix Eureka Server and Eureka Clients
- [x] Inter-Service Communication using `RestTemplate`
- [x] `DiscoveryClient`
- [x] Inter-Service Communication using OpenFeign
- [x] Spring Cloud Gateway
- [x] Spring Boot Admin
- [x] Spring Boot Actuator
- [ ] Advanced Load Balancing
- [ ] Centralized Configuration
- [ ] Fault Tolerance and Resilience
- [ ] Dockerizing Microservices
- [ ] Microservices Deployment

---

# 🛠️ Projects

## 01. SpringBootP01 — Spring Boot Fundamentals

My first Spring Boot project, created to understand the fundamentals of backend development.

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

## 02. SpringBootP02 — Student Management REST API

A Student Management REST API developed to understand CRUD operations and layered architecture.

### Topics Covered

- REST API development
- CRUD operations
- Controller layer
- Service layer
- Repository layer
- Exception handling

### Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven

## 03. SpringBootP03 — Student Management with JPA

A Student Management application using Spring Data JPA and MySQL for database operations.

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

## 04. LibraryManagementAPI — Library Management REST API

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

## 05. BookMyShowBE — Movie Ticket Booking Backend

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
- Profile management
- Custom exception handling
- Global API exception handling
- MySQL database integration

### Architecture

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

## 06. SpringSecurityP01 — Spring Security Fundamentals

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

## 07. MicroservicesP01 — Eureka and RestTemplate

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

Endpoint:

```http
GET http://localhost:8082/api/hello
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

**4. Spring Boot Admin Server — Port 8083**

- Provides an application monitoring dashboard.
- Displays configured Spring Boot applications.
- Uses Actuator information exposed by registered client applications.

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
- Multiple independent Spring Boot applications
- Service registration and discovery
- Netflix Eureka Server and Eureka Clients
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

## 08. MicroservicesP02 — Student Management Microservices

A beginner-friendly microservices project developed to understand how multiple Spring Boot applications communicate through service discovery, declarative HTTP clients, and an API Gateway.

The project uses **in-memory sample data** instead of a database, keeping the focus on microservices fundamentals.

### Applications Included

**1. Eureka Server — Port 8761**

- Acts as the central service registry.
- Receives registrations from the microservices.
- Helps clients discover services by application name.
- Provides a dashboard to inspect registered instances.

Dashboard: `http://localhost:8761`

**2. Admin Server — Port 9090**

- Provides a Spring Boot Admin dashboard.
- Monitors registered client applications.
- Displays application health and available monitoring information.
- Uses Actuator endpoints exposed by the applications.

Dashboard: `http://localhost:9090`

**3. Student Service — Port 8081**

- Provides Student REST APIs.
- Returns all students and individual student details.
- Maintains sample student data in memory.
- Uses OpenFeign to retrieve course information from Course Service.
- Registers with Eureka and Spring Boot Admin.

Endpoints:

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

Endpoints:

```http
GET http://localhost:8082/api/courses
GET http://localhost:8082/api/courses/101
```

**5. API Gateway — Port 8085**

- Provides a single entry point for Student and Course APIs.
- Routes Student requests to Student Service.
- Routes Course requests to Course Service.
- Uses Eureka service discovery and Spring Cloud LoadBalancer to resolve service destinations.
- Exposes Actuator endpoints for health monitoring.

The Gateway uses port `8085` because port `8080` was already occupied on the development machine.

Endpoints:

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
                  /        \
                 v          v
       Student Service    Course Service
           Port 8081        Port 8082
                 |              ^
                 |              |
                 +-- OpenFeign -+
                        |
                        v
                  Course Details

             +--------------------+
             |    Eureka Server   |
             |      Port 8761     |
             | Service Discovery  |
             +--------------------+

             +--------------------+
             |    Admin Server    |
             |      Port 9090     |
             | Application Monitor|
             +--------------------+
```

### Example Inter-Service Communication

When a client requests:

```http
GET http://localhost:8085/api/students/1/course
```

The request follows this flow:

1. API Gateway receives the request.
2. Gateway discovers Student Service through Eureka.
3. Student Service finds the requested student and reads their `courseId`.
4. OpenFeign calls Course Service to retrieve the corresponding course.
5. Student Service combines the student and course information.
6. The combined JSON response returns through API Gateway.

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
- API testing using a browser and Postman

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

### Important Design Decisions

- No database or Spring Data JPA.
- No authentication or authorization.
- No Kafka or messaging infrastructure.
- No Docker or Config Server.
- Sample data is maintained in memory.
- Each application is independently runnable.
- The project focuses on learning service discovery, communication, routing, and monitoring.

---

## 🧰 Technologies and Tools

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

## 🎯 Future Goals

- Practise automated testing with JUnit and Mockito.
- Explore advanced JWT authentication and authorization.
- Understand centralized configuration with Spring Cloud Config.
- Learn fault tolerance and resilience patterns.
- Explore load balancing with multiple service instances.
- Containerize applications using Docker.
- Deploy Spring Boot applications.
- Build larger applications using microservices architecture.

## 📈 My Learning Philosophy

I believe in learning by building projects, understanding how each component works internally, testing APIs, debugging errors, and gradually progressing from basic concepts to production-oriented backend development.

This repository will continue to evolve as I learn and implement new concepts.

---

⭐ **Thank you for visiting my Spring Boot Learning Journey!**
