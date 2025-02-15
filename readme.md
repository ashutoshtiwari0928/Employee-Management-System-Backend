# Employee Management System - Backend

## 🚀 Overview
This is the backend of the Employee Management System, built using **Spring Boot** and **MySQL**. It provides RESTful APIs for managing employees, handling authentication, and performing CRUD operations.

## 🛠️ Tech Stack
- **Language:** Java
- **Framework:** Spring Boot
- **Database:** MySQL
- **Security:** JWT Authentication
- **Build Tool:** Maven
- **Cloud Deployment:** AWS (EC2, RDS, S3)

## 📌 Features
- Employee **CRUD Operations** (Create, Read, Update, Delete)
- **User Authentication** using JWT
- **Role-based Access Control**
- **Exception Handling** for robust API responses
- **Logging and Monitoring**

## 🏗️ Project Structure
```
Employee-Management-System-Backend/
│── src/main/java/com/ems/
│   ├── controller/      # REST API controllers
│   ├── service/         # Business logic
│   ├── repository/      # Database interactions
│   ├── model/           # Entity classes
│   ├── config/          # Security and JWT configurations
│── src/main/resources/
│   ├── application.properties  # Database & server configuration
│── pom.xml  # Dependencies
```

## 📦 Installation & Setup
### Prerequisites
- Java 17+
- MySQL Server
- Maven
- Recommended IDE (Intellij, however any IDE of your choice would work)

### Steps to Run
1. **Clone the Repository**
   ```sh
   git clone https://github.com/ashutoshtiwari0928/Employee-Management-System-Backend.git
   cd Employee-Management-System-Backend
   ```
2. **Configure Database**
   Update `src/main/resources/application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. **Build & Run**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## 🚀 Deployment on AWS
### Steps to Deploy
1. **Create an EC2 instance** (Ubuntu or Amazon Linux)
2. **Install Java & Maven** on EC2
   ```sh
   sudo apt update && sudo apt install openjdk-17-jdk maven -y
   ```
3. **Transfer JAR File to EC2**
   ```sh
   scp target/ems-backend.jar ubuntu@your-ec2-ip:/home/ubuntu/
   ```
4. **Run the Application**
   ```sh
   nohup java -jar ems-backend.jar &
   ```
5. **Set Up RDS for MySQL**
6. **Use AWS S3 for File Storage (Optional)**

## 📖 API Documentation
You can access API documentation using **Swagger**:
```
http://localhost:8080/swagger-ui/index.html
```

## 🤝 Contribution
Feel free to fork this repo and submit pull requests.

## 📜 License
This project is licensed under the MIT License.

---
### 🔗 Connect with Me
[GitHub](https://github.com/ashutoshtiwari0928) | [LinkedIn](#)
