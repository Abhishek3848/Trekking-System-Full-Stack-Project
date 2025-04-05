<h1 align="center">🏔️ Trekking System - Full Stack Project</h1>

<p align="center">
  <b>React + Spring Boot Microservices | API Gateway | Service Discovery</b><br>
  A complete end-to-end full-stack trekking event management system.
</p>

---

## 📚 Table of Contents

- [📦 Technologies Used](#-technologies-used)
- [🧩 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
- [📸 Screenshots](#-screenshots)
- [💡 Features](#-features)
- [📌 Future Scope](#-future-scope)

---

## 📦 Technologies Used

| Frontend         | Backend (Microservices)      | Others                     |
|------------------|------------------------------|----------------------------|
| React.js         | Spring Boot (Java)           | Eureka Discovery Server    |
| Axios            | Spring Data JPA, REST APIs   | Spring Cloud Gateway       |
| Tailwind / CSS   | MySQL                        | Maven, Postman             |

---

## 🧩 Project Structure



---

## 🚀 Getting Started

### 🛠️ Backend (Microservices)

1. **Start Eureka Server**  
   `cd DiscoveryServer`  
   `mvn spring-boot:run`

2. **Start API Gateway**  
   `cd ApiGateway`  
   `mvn spring-boot:run`

3. **Start Microservices**  
   Run each one individually:
   - `cd p27_userservice && mvn spring-boot:run`
   - `cd p27_eventservice && mvn spring-boot:run`
   - `cd p27_orderservice && mvn spring-boot:run`

> Ensure MySQL is running and properties are set correctly in `application.properties`.

### 🎨 Frontend

1. `cd Frontend`
2. `npm install`
3. `npm start`

> The frontend should now run on `http://localhost:3000`  
> Backend routes go through the gateway: `http://localhost:8080`

---

## 📸 Screenshots

| Home Page | Events List | Booking Page |
|-----------|-------------|--------------|
| *(Add screenshots here later)* | | |

---

## 💡 Features

- 🔐 User authentication and registration
- 📅 View and book trekking events
- 📦 Microservices for better scalability and modular design
- 🚪 Centralized entry point via API Gateway
- 🔍 Service discovery with Eureka

---

## 📌 Future Scope

- ⛅ Deploy on cloud platforms (like Render, Railway, or AWS)
- 📈 Admin dashboard for managing events
- 🧾 Email notifications and booking history
- 💳 Payment integration

---

## 👨‍💻 Developed By

**Abhishek3848**

[🔗 GitHub Profile »](https://github.com/Abhishek3848)

---



  
