Shopease – E-Commerce Backend API

Spring Boot | JWT | MySQL

Shopease is a secure, scalable, and production-ready e-commerce backend built using Spring Boot, Spring Security (JWT), and MySQL.
It provides complete REST APIs for authentication, product management, cart, orders, payments, and user roles, following clean architecture and best practices.

🚀 Key Features
🔐 Authentication & Authorization

JWT-based Login & Registration

BCrypt password encryption

Role-based access control:

ADMIN

CUSTOMER

Secured APIs using Spring Security

📦 Product & Category Management

Add / Update / Delete products (Admin only)

Fetch all products with:

Search

Filter

Pagination

Category-wise product listing

Clean separation using DTOs

🛒 Cart Management

Add products to cart

Update product quantity

Remove items from cart

Auto-calculated cart total

One-to-One mapping:
User ↔ Cart

📑 Order Management

Place order directly from cart

View user-specific order history

Admin can view & manage all orders

Order lifecycle management:

PENDING → CONFIRMED → SHIPPED → DELIVERED

💳 Payment Simulation

Fake payment gateway (for learning purpose)

Payment status:

SUCCESS

FAILED

Transaction details stored in MySQL

🗄️ Database Design & Relationships

ORM: JPA / Hibernate

Entity Relationships:

User ↔ Cart (One-to-One)

User ↔ Orders (One-to-Many)

Order ↔ OrderItems (One-to-Many)

Category ↔ Products (One-to-Many)

🧩 Best Practices Used

Layered Architecture
Controller → Service → Repository → Entity

DTO + Hibernate Validation

Global Exception Handling

Swagger API Documentation

Clean & readable code structure

🛠️ Tech Stack
Layer	Technology
Backend	Spring Boot, Spring Web
Security	Spring Security, JWT
ORM	Spring Data JPA, Hibernate
Database	MySQL
Tools	Maven, Postman, Swagger UI, Git

```
📁 Project Structure (Layered Architecture
src/
 └── main/
     ├── java/com/shopease/backend/
     │   ├── controller
     │   ├── service
     │   ├── repository
     │   ├── entity
     │   ├── dto
     │   ├── config
     │   └── exception
     └── resources/
         ├── application.properties

```

📘 API Documentation (Swagger)

Once the application is running, open:

http://localhost:8080/swagger-ui/index.html


You can test all secured & public APIs directly from Swagger.

⚙️ How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/yourname/shopease-backend.git

2️⃣ Configure MySQL

Create database:

CREATE DATABASE shopease_db;


Update credentials in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/shopease_db
spring.datasource.username=root
spring.datasource.password=yourpassword

3️⃣ Run the Application
mvn spring-boot:run

🌱 Future Enhancements

Real payment gateway integration (Razorpay / Stripe)

Product reviews & ratings

Wishlist feature

Order cancellation & refund flow

Admin dashboard APIs
