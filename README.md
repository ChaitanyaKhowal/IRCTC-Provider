# 🚆 IRCTC-Provider

## Overview
IRCTC-Provider is a **Spring Boot REST API** for train ticket booking.  
It allows users to:  
✅ **Book tickets** by providing passenger details.  
🔍 **Retrieve booking details** using **PNR Number**.  
📜 **Fetch all passenger records** in the system. 
🔗 Also, check out the Consumer API that interacts with this Provider:
👉 CheckMyTrip - Consumer API 

---

## 🔧 Tech Stack
- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **Persistence:** Spring Data JPA
- **Build Tool:** Maven
- **REST API:** Spring Boot Web  

---

## 📌 API Endpoints

| Method  | Endpoint             | Description                         |
|---------|----------------------|-------------------------------------|
| POST    | /ticket              | Book a new ticket                   |
| GET     | /tickets             | Fetch all booked tickets            |
| GET     | /passenger/{pnr}     | Retrieve details using PNR Number   |

---

## 🎟️ **1. Book a Ticket**

### **Request**
```http
POST /ticket
Content-Type: application/json
json
Copy
Edit
{
  "name": "John Doe",
  "email": "john@example.com",
  "age": 30,
  "journeyDate": "2025-02-15",
  "source": "Mumbai",
  "destination": "Delhi"
}
Response
json
Copy
Edit
{
  "message": "Ticket Booked Successfully. This is your PNR Number: 1234567890"
}
📜 2. Get All Tickets
Request
http
Copy
Edit
GET /tickets
Response
json
Copy
Edit
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
🔍 3. Get Ticket by PNR
Request
h
Copy
Edit
GET /passenger/1234567890
Response (If found)
json
Copy
Edit
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
Response (If not found)
json
Copy
Edit
{
  "message": "No Ticket found for PNR : 1234567890"
}
📂 Project Structure
css
Copy
Edit
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
🚀 Setup & Installation
1️⃣ Clone the Repository
bash
Copy
Edit
git clone https://github.com/ChaitanyaKhowal/IRCTC-Provider.git
cd IRCTC-Provider
2️⃣ Build the Project
bash
Copy
Edit
mvn clean install
3️⃣ Run the Application
bash
Copy
Edit
mvn spring-boot:run
4️⃣ Access the API
Base URL: http://localhost:8080/
Example: http://localhost:8080/tickets
📜 License
This project is open-source under the MIT License.

🔹 Developed by Chaitanya Khowal
💡 Contributions are welcome! Feel free to fork and enhance this project.
