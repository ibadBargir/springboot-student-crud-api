

<h1 align="center">🎓 Spring Boot Student CRUD API</h1>

<p align="center">
  A fully functional RESTful API built using Java, Spring Boot, MySQL, and Postman. <br>
  Perform Create, Read, Update, and Delete operations on student records with clean and scalable code structure.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-24.0.1-orange?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen?style=for-the-badge&logo=springboot&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/Postman-Tested-orange?style=for-the-badge&logo=postman"/>
</p>

---

## 📚 Table of Contents

- [📌 Project Overview](#-project-overview)
- [⚙️ Tech Stack](#️-tech-stack)
- [📁 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
- [📮 API Endpoints](#-api-endpoints)
- [💡 Features](#-features)
- [📸 Screenshots](#-screenshots)
- [🧠 What I Learned](#-what-i-learned)
- [🧑‍💻 Author](#-author)

---

## 📌 Project Overview

This is a backend REST API for managing student records in a MySQL database. It supports:

- Creating new student entries
- Viewing all students
- Updating student data
- Deleting students

This project is ideal for understanding how Spring Boot works with Spring Data JPA, REST controllers, and external databases like MySQL.

---

## ⚙️ Tech Stack

- ☕ Java 24
- 🌱 Spring Boot 3.5.3
- 🛢 MySQL (via XAMPP)
- 🧪 Postman for testing APIs
- 🐳 Maven
- 📦 HikariCP (default Spring Boot connection pool)
- 💻 IDE: intellij

---

### 📁 Project Structure

```bash
demoSpringAPI/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── demoSpringAPI/
│       │               ├── DemoSpringApiApplication.java      # Main Spring Boot entry class
│       │               └── Student/
│       │                   ├── Student.java                   # Entity class
│       │                   ├── StudentController.java         # REST Controller
│       │                   ├── StudentService.java            # Business logic service
│       │                   ├── StudentRespository.java        # JPA Repository
│       │                   └── StudentConfig.java             # CommandLineRunner for dummy data
│       └── resources/
│           ├── application.properties                         # DB and JPA config
│           └── static/                                        # Static files (if needed)
│           └── templates/                                     # Thymeleaf templates (optional)
├── pom.xml                                                    # Project dependencies and plugins
└── README.md                                                  # Project documentation
```




---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17 or higher
- MySQL Server (via XAMPP or local install)
- STS / IntelliJ / VS Code
- Postman

🧑‍💻 Author
Ibad Mohammad Javed Bargir
📧 ibad72086@gmail.com

⭐ Star the Repository
If this helped you or impressed you, consider giving it a ⭐ — it helps a lot!
