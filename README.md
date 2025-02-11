# 🚆 IRCTC-Provider

## Overview
IRCTC-Provider is a **Spring Boot REST API** for train ticket booking.  
It allows users to:  
✅ **Book tickets** by providing passenger details.  
🔍 **Retrieve booking details** using **PNR Number**.  
📝 **Fetch all passenger records** in the system.  

---

🔗 **Related Repository**
This project is a **Provider API**, and there is also a **Consumer API** that interacts with this project.  
👉 Check out the **[CheckMyTrip - Consumer API](https://github.com/ChaitanyaKhowal/CheckMyTrip-Consumer)** repository.

---

## 🔧 Tech Stack
- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **Persistence:** Spring Data JPA
- **Build Tool:** Maven
- **REST API:** Spring Boot Web  

---

## 📌 API Endpoints

| **Method** | **Endpoint**          | **Description**                   |
|-----------|----------------------|-----------------------------------|
| POST      | `/ticket`            | Book a new ticket                |
| GET       | `/tickets`           | Fetch all booked tickets         |
| GET       | `/passenger/{pnr}`   | Retrieve details using PNR Number |

---

## 🎟️ **1. Book a Ticket**

### **Request**
```http
POST /ticket
Content-Type: application/json
```
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "age": 30,
  "journeyDate": "2025-02-15",
  "source": "Mumbai",
  "destination": "Delhi"
}
```

### **Response**
```json
{
  "message": "Ticket Booked Successfully. This is your PNR Number: 1234567890"
}
```

---

## 📝 **2. Get All Tickets**

### **Request**
```http
GET /tickets
```

### **Response**
```json
{
  "dto": [
    {
      "id": 1,
      "name": "John Doe",
      "email": "john@example.com",
      "age": 30,
      "journeyDate": "2025-02-15",
      "source": "Mumbai",
      "destination": "Delhi",
      "pnrNo": "1234567890"
    }
  ]
}
```

---

## 🔍 **3. Get Ticket by PNR**

### **Request**
```http
GET /passenger/1234567890
```

### **Response (If found)**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "age": 30,
  "journeyDate": "2025-02-15",
  "source": "Mumbai",
  "destination": "Delhi",
  "pnrNo": "1234567890"
}
```

### **Response (If not found)**
```json
{
  "message": "No Ticket found for PNR : 1234567890"
}
```

---

## 📂 Project Structure
```
IRCTC-Provider
│── src/main/java/com/irctc
│   ├── dto/
│   │   ├── PassengerDto.java
│   ├── entity/
│   │   ├── PassengerData.java
│   ├── repo/
│   │   ├── PassengerRepository.java
│   ├── rest/
│   │   ├── PassengerRestController.java
│   ├── service/
│   │   ├── PassengerService.java
│   │   ├── PassengerServiceImpl.java
│── pom.xml
│── README.md
```

---

## 🚀 Setup & Installation

### **1. Clone the Repository**
```sh
git clone https://github.com/ChaitanyaKhowal/IRCTC-Provider.git
cd IRCTC-Provider
```

### **2. Build the Project**
```sh
mvn clean install
```

### **3. Run the Application**
```sh
mvn spring-boot:run
```

### **4. Access the API**
- **Base URL:** `http://localhost:8080/`
- **Example:** `http://localhost:8080/tickets`

---

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).

---

## **Author**

👨‍💻 **Chaitanya Khowal**\
## 📞 Contact
- 📧 Email: [chaitanyakhowal8@gmail.com](mailto:chaitanyakhowal8@gmail.com)
- 💼 LinkedIn: [Chaitanya Khowal](https://www.linkedin.com/in/chaitanyakhowal/)
- 🐙 GitHub: [ChaitanyaKhowal](https://github.com/ChaitanyaKhowal)
- 📷 Instagram: [@devil_since.2001](https://www.instagram.com/devil_since.2001/)

---
🌟 If you like this project, consider giving it a ⭐ on [GitHub](https://github.com/ChaitanyaKhowal/Portfolio-Website)!



