# Freelance Test Item Management REST API

A simple Java Spring Boot backend application that implements a RESTful API
for managing a collection of items using in-memory storage.

This project was created as a sample task for a Freelance Java Developer opportunity.

---

## 🚀 Features

- Create a new item
- Retrieve an item by ID
- Input validation at API level
- In-memory data storage using ArrayList
- DTO-based API design
- Lombok to reduce boilerplate code

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 4.0.2
- Spring Web
- Lombok
- Jakarta Validation
- Maven

---

## 📁 Project Structure

```
src/main/java/com/example/items
│
├── controller
│ └── ItemController.java
├── service
│ └── ItemService.java
├── dto
│ ├── ItemRequestDTO.java
│ └── ItemResponseDTO.java
├── model
│ └── Item.java
└── ItemServiceApplication.java
```

## 📌 API Endpoints

### ➕ Add Item

**Endpoint**


**Request Body**
```json
{
  "name": "iPhone 15",
  "description": "Apple smartphone"
}
```
**Response**

```
{
  "id": 1,
  "name": "iPhone 15",
  "description": "Apple smartphone with A17 chip"
}
```
## 🔍 Get Item by ID

**Endpoint**

```
GET /api/items/{id}
```

**Example**

```
GET /api/items/1
```

**Response**
```
{
  "id": 1,
  "name": "iPhone 15",
  "description": "Apple smartphone with A17 chip"
}
```

## ▶️ Running the Application Locally

**Prerequisites**

- Java 17 or above

- Maven

**Steps**

```
mvn clean install
mvn spring-boot:run
```

**Application will start at:**

```
http://localhost:8089
```

## 🧠 Implementation Details

- The application uses an in-memory ArrayList for data storage as required.

- Item IDs are generated internally using a counter to simulate auto-increment behavior.

- DTOs are used to separate API contracts from internal domain models.

- Validation is handled at the API boundary.

- No database is used.

## 🌐 Deployed Application

**Hosted URL:**

```
Deployed Link : https://freelancer-test-task-93he.onrender.com
```
## Deployment Note

## Deployment Note

This application is deployed on **Render (Free Tier)**.

Render automatically puts free services to sleep after a period of inactivity.  
Because of this, the **first request after inactivity may take up to 30–40 seconds** while the service wakes up. Once the service is active, subsequent requests will be fast.

If you are testing the API using **Postman**, you do **not** need to open the service in a browser first.  
Any HTTP request (browser, Postman, or curl) will wake up the service. However, please ensure the first request is allowed to complete or increase the Postman request timeout if needed.









