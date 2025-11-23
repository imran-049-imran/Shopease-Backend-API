Shopease – Backend API (Spring Boot + MySQL)

A secure and scalable e-commerce backend built using Spring Boot, JWT Authentication, and MySQL.
Provides complete APIs for products, categories, cart, orders, payments, and user management.

Key Features
🔹 Authentication & Authorization

JWT-based secure login & register

BCrypt password hashing

Role-based access: Admin & Customer

🔹 Product Management

Add, update, delete products (Admin)

Get all products with search, filter, pagination

Category-wise product listing

🔹 Cart Management

Add/remove products from cart

Update quantity in cart

Auto-calculated total amount

One-to-One mapping: User ↔ Cart

🔹 Order Management

Place orders from cart

View user-specific order history

Admin can track all orders

Order lifecycle:
Pending → Confirmed → Shipped → Delivered

🔹 Payment Simulation

Fake payment gateway (Success / Failed)

Transaction logs stored in MySQL

🔹 Database & Relations

ORM: JPA / Hibernate

Entity Mappings:

User ↔ Cart (One-to-One)

User ↔ Orders (One-to-Many)

Order ↔ OrderItems (One-to-Many)

Category ↔ Products (One-to-Many)

🔹 Utility & Best Practices

Global Exception Handling

DTO + Validation (Hibernate Validator)

Clean Architecture:
Controller → Service → Repository → Entity

Swagger API Documentation for all endpoints

Tech Stack

Backend: Spring Boot, Spring Web, Spring Data JPA

Security: Spring Security + JWT

Database: MySQL

Tools: Maven, Postman, Swagger UI, Git

Project Structure (Layered Architecture)
src/
 └── main/
      ├── java/com/shopease/backend/
      │     ├── controller
      │     ├── service
      │     ├── repository
      │     ├── entity
      │     ├── dto
      │     ├── config
      │     └── exception
      └── resources/
            ├── application.properties
            └── data.sql  (optional)

🔗 API Documentation

Once project runs:

http://localhost:8080/swagger-ui/index.html

🛠 How to Run
1. Clone Repo
git clone https://github.com/yourname/shopease-backend.git

2. Configure MySQL

Create a database:

CREATE DATABASE shopease_db;


Add credentials in application.properties.

3. Run Application
mvn spring-boot:run

📌 Future Enhancements

Real payment gateway (Razorpay / Stripe)

Wishlists & Reviews

Admin dashboard

Microservices migration

❤️ Contributions

Pull requests are welcome!
