# Employee Management REST API

This is a backend project for managing employees using **Spring Boot** and **PostgreSQL** (or MySQL). It provides a simple RESTful API that supports creating, retrieving, updating, and deleting employees.

---

## Features

- REST API for employee management
- Spring Boot and Spring Data JPA
- PostgreSQL or MySQL database
- Exception handling for errors
- Tested using Postman
- Postman collection included for testing

---

## Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- PostgreSQL or MySQL
- Maven or Gradle
- Postman

---

## Setup Instructions

### 1. Clone the Repository

Run the following command to clone the repository:

```bash
git clone https://github.com/your-username/employee-management-api.git
cd employee-management-api

```

### 2. Create a Database

Before proceeding, you need to create a database for your application. Run the appropriate SQL command depending on your database choice.

For PostgreSQL:
Open a terminal (or use a PostgreSQL client) and run:

```
CREATE DATABASE employees_db;
```

For MySQL:
Open a terminal (or use a MySQL client) and run:

```
CREATE DATABASE employees_db;
```

3. Configure Application Properties
Next, you'll configure your connection to the database.

Open src/main/resources/application.properties.

Replace the database connection information with your specific credentials.

For PostgreSQL:
Edit application.properties as follows:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/employees_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8080
```

4. Build and Run the Application
Using Maven:
If you are using Maven, run the following in your terminal to start the app:

```
./mvnw spring-boot:run
```

 **Sample JSON Requests**

1. **Create Employee:**

json

POST /employees
Content-Type: application/json
```
{
  "name": "Nina Namalwa",
  "email": "namalwa@gmail.com",
  "position": "Backend Developer",
  "salary": 75000
}
```
2.**Update Employee:**

json

PUT /employees/1
Content-Type: application/json

```
{
  "name": "Alice Smith",
  "email": "alice.smith@example.com",
  "position": "Senior Developer",
  "salary": 85000
}
```

3. **Get All Employees:**
```
curl http://localhost:8080/employees
```

4.**Update Employee:**

```
 -X PUT http://localhost:8080/employees/1 
 "Content-Type: application/json" 
'{"name":"Mercy Mary", "email":"mercy@gmail.com", "position":"Manager", "salary":90000}'
```

5.**Delete Employee:**
```
DELETE http://localhost:8080/employees/1
```


### Testing with Postman
Open Postman.

Click Import.

Select the file:

 For example  postman/EmployeeManagement.postman_collection.json.

Use the collection to test all endpoints.