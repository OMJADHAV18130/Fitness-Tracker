# 🏋️ Fitness Tracker

A backend application built with **Spring Boot** that helps users manage their fitness activities and receive activity-based recommendations.

The application provides secure user authentication using **JWT**, database interaction through **Spring Data JPA**, and API documentation through **Swagger/OpenAPI**.

---

## 🚀 Features

- 🔐 JWT-based authentication and authorization
- 👤 User management
- 🏃 Fitness activity tracking
- 💡 Activity-based fitness recommendations
- 🗄️ Database integration using Spring Data JPA
- 🔒 Spring Security integration
- 📚 Swagger/OpenAPI API documentation
- 🌐 RESTful APIs
- 🧩 Layered backend architecture

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Stateless authentication |
| Spring Data JPA | Database interaction |
| Hibernate | ORM |
| Maven | Dependency Management |
| Swagger / OpenAPI | API Documentation |

---

## 🏗️ Architecture

The project follows a layered Spring Boot architecture:

```text
Client
   │
   ▼
REST Controllers
   │
   ▼
Service Layer
   │
   ▼
Repository Layer
   │
   ▼
Database
