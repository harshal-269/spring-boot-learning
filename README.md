# Spring Boot Learning Journey 🚀

This repository documents my journey of learning Spring Boot and backend development.

My goal is to understand Spring Boot deeply by learning concepts step-by-step and applying them through projects.

---

## 📚 Learning Roadmap

### Spring Core

- [x] IoC
- [x] Dependency Injection
- [x] Constructor Injection
- [x] Setter Injection
- [x] @Autowired
- [x] @Qualifier
- [x] @Primary
- [x] @Component
- [x] @Service
- [x] @Configuration
- [x] @Bean

### Spring Boot

- [x] Spring Boot Basics
- [x] Project Structure
- [x] REST API
- [x] Controller
- [x] Service
- [x] Repository
- [x] CRUD Operations
- [x] JPA
- [x] MySQL
- [x] Exception Handling
- [x] Validation
- [x] DTOs
- [x] Spring Security
- [ ] JWT Authentication
- [ ] Testing
- [ ] Docker
- [ ] Deployment

---

# 🛠️ Projects

## 1. SpringBootP01

My initial Spring Boot project.

### Topics

- Spring Boot fundamentals
- REST API
- Controller
- Service
- Dependency Injection

---

## 2. SpringBootP02

Student Management REST API.

### Topics

- REST API
- CRUD operations
- Controller
- Service layer
- Repository
- Exception handling

---

## 3. SpringBootP03 — Student Management / JPA

Student Management application using Spring Data JPA.

### Topics

- JPA
- Entity
- Repository
- MySQL
- Service layer
- Exception handling

---

# 📚 4. Library Management REST API

A backend REST API built using **Java and Spring Boot** for managing books in a library.

This project focuses on understanding:

- Layered architecture
- CRUD operations
- DTOs
- Validation
- JPA
- MySQL
- Exception handling

### 🚀 Features

- Create a new book
- Get all books
- Get book by ID
- Update a book
- Delete a book
- Request validation
- Exception handling
- Custom `BookNotFoundException`
- Request DTO and Response DTO
- DTO ↔ Entity conversion
- MySQL database integration

### 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Jakarta Validation
- Postman
- Git & GitHub

---

# 🎬 5. BookMyShowBE

A backend REST API project inspired by a movie ticket booking platform.

The project focuses on building a real-world Spring Boot backend with multiple entities, layered architecture, DTOs, database relationships, booking functionality, and exception handling.

### 🚀 Features

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
- REST API architecture

### 🏗️ Architecture

The project follows a layered architecture:

```text
Client
   ↓
Controller



# 🔐 6. Spring Security P01 — Authentication & Authorization

A practical Spring Security project built to understand the fundamentals of authentication and authorization.

### 🚀 Features

- User registration
- Password encryption using BCrypt
- User authentication
- USER and ADMIN roles
- Role-based authorization
- Protected REST APIs
- Spring Security default login
- Authentication and authorization flow
- Access control for protected endpoints
- `401 Unauthorized`
- `403 Forbidden`

### 🔑 Concepts Learned

- Spring Security
- `PasswordEncoder`
- `BCryptPasswordEncoder`
- `UserDetailsService`
- `SecurityFilterChain`
- Authentication
- Authorization
- Role-Based Access Control
- Protected endpoints
- Security filters
- User roles

### 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven
- Postman
- Git & GitHub
   ↓
Service
   ↓
Repository
   ↓
MySQL Database
