Key Features
🔹 Authentication & Authorization

JWT-based secure login & register

BCrypt password hashing

Role-based access (Admin & Customer)

🔹 Product Management

Add, update, delete products (Admin)

Product listing with search, filters, pagination

Category-wise product browsing

🔹 Cart Management

Add/remove products to cart

Update quantity

Auto-calculate total price

Map user ↔ cart with One-to-One relation

🔹 Order Management

Place orders from cart

Order history for users

Admin can track all orders

Order status flow: Pending → Confirmed → Shipped → Delivered

🔹 Payment Simulation

Fake payment gateway (Success/Fail)

Transaction logs stored in DB

🔹 Database & Relations

JPA/Hibernate ORM

Entities with proper mapping:

User ↔ Cart (One-to-One)

User ↔ Orders (One-to-Many)

Order ↔ OrderItems (One-to-Many)

Category ↔ Products (One-to-Many)

🔹 Utility & Best Practices

Global Exception Handling

DTO + Validation (Hibernate Validator)

Clean architecture (Controller → Service → Repository → Entity)

Swagger API Documentation

Docker-ready structure

🏗 Tech Stack

Backend: Spring Boot, Spring Web, Spring Data JPA

Security: Spring Security + JWT

Database: MySQL

Tools: Maven, Postman, Swagger UI, Git

Build/Deploy: Docker, Docker Compose
