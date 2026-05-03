# gifsPage — Spring Boot GIF Browser

![Status](https://img.shields.io/badge/status-finished-brightgreen)
![Version](https://img.shields.io/badge/version-0.0.1--SNAPSHOT-blue)
![Java](https://img.shields.io/badge/Java-8-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.0.0-success?logo=springboot)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0-005F0F?logo=thymeleaf)
![Swagger](https://img.shields.io/badge/Swagger-2.9.2-brightgreen?logo=swagger)
![License](https://img.shields.io/badge/License-MIT-yellow)

A lightweight **Spring Boot web application** for browsing, searching and managing GIFs.  
Provides a simple UI built with **Thymeleaf** and exposes a small **REST API** for GIFs and categories.

---

## 🎯 Features

- **Browse all GIFs** stored in the application
- **Search GIFs** by name (case‑insensitive)
- **Mark GIFs as favorites**
- **View favorite GIFs**
- **Browse GIFs by category**
- **REST API** for GIFs and categories
- **Swagger UI** (Springfox 2.9.2)

---

## 🏗️ Architecture Overview

The project follows a classic **Spring MVC + REST** structure:

```
src/main/java/com/bielinski/kwejk
 ├── controller
 │    ├── HomeController.java          # Main UI endpoints
 │    ├── CategoryController.java      # Category UI endpoints
 │    └── api
 │         ├── GifApiController.java   # REST: /api/gifs
 │         └── CategoryApiController.java
 │
 ├── model
 │    ├── Gif.java
 │    └── Category.java
 │
 ├── repository
 │    ├── GifRepository.java           # In‑memory GIF storage
 │    └── CategoryRepository.java      # In‑memory categories
 │
 ├── config
 │    └── SwaggerConfig.java
 │
 └── KwejkApplication.java
```

### 🖼️ Views (Thymeleaf)

```
src/main/resources/templates
 ├── home.html
 ├── favorites.html
 ├── gif-details.html
 ├── categories.html
 ├── category.html
 └── fragments/
      ├── navigationBar.html
      ├── gifs.html
      └── search-barContainer.html
```

### 📁 Static resources

```
src/main/resources/static
 ├── gifs/          # GIF files
 ├── icons/
 ├── vendor/        # Materialize + jQuery
 ├── app.css
 └── app.js
```

---

## 🔌 REST API

### 📍 **GET /api/gifs**
Returns all GIFs.

### 📍 **GET /api/gifs/find?name=...**
Search GIFs by name (case‑insensitive).

### 📍 **GET /api/categories**
Returns all categories.

### 📍 **GET /api/categories/find?name=...**
Search categories by name.  
If no results → returns all categories.

---

## 🌐 MVC Endpoints (Thymeleaf)

### `/`
Home page — displays all GIFs.

### `/favorites`
Displays only favorite GIFs.

### `/gif/{name}`
GIF details page.

### `/gif/{name}/favorite`
Toggles favorite status.

### `/gifs/search?q=...`
Search GIFs by name.

### `/categories`
List all categories.

### `/category/{id}`
Display category + GIFs belonging to it.

### `/categories/search?q=...`
Search categories by name.

---

## 🧠 Data Model

### **Gif**
```java
String name;
String username;
boolean favorite;
int categoryId;
```

### **Category**
```java
Long id;
String name;
```

All data is stored **in memory** using static lists in repositories.

---

## 🧰 Technologies Used

- **Java 8**
- **Spring Boot 2**
- **Spring MVC**
- **Thymeleaf**
- **Springfox Swagger 2.9.2**
- **Materialize CSS**
- **jQuery**
- **Maven**

---

## 🚀 Running the Application

### Prerequisites
- Java 8+
- Maven 3.8+

### Build & Run
```bash
mvn clean package
mvn spring-boot:run
```

App starts at:

```
http://localhost:8080
```

Swagger UI (if enabled):

```
http://localhost:8080/swagger-ui.html
```

---

## 🛠️ Planned Improvements

- Persistent storage (H2 / PostgreSQL)
- Uploading new GIFs via UI
- User accounts & authentication
- Category management (CRUD)
- REST API for favorites
- Modernized frontend (Bootstrap / Tailwind)

---

## 📄 License

This project is licensed under the MIT License.
