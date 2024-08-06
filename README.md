Expense Management Application
Overview
This project is an Expense Management Application built using Spring Boot, JPA (Java Persistence API), and Lombok. It allows users to manage and track their expenses through a RESTful API.

Features
Add, update, delete, and view expenses.
Persist data using a MySQL database.
Simplified code with Lombok.
Prerequisites
Before setting up the project, make sure you have the following installed:

Java Development Kit (JDK) 17 or higher
Maven
MySQL Server
SQL Workbench
Setup Instructions
1. Clone the Repository
Clone the repository to your local machine using the following command:

bash
Copy code
git clone https://github.com/your-username/expense-management.git
Navigate to the project directory:

bash
Copy code
cd expense-management
2. Set Up MySQL Database
2.1 Install MySQL Server
If you haven't installed MySQL Server, download and install it from the official website.

2.2 Create a New Database
Open SQL Workbench and connect to your MySQL Server. Run the following command to create a new database:

sql
Copy code
CREATE DATABASE expense_management_db;
2.3 Configure Database Credentials
Open the src/main/resources/application.properties file and configure the database connection settings:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/expense_management_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
Replace your_mysql_username and your_mysql_password with your actual MySQL credentials.

3. Build and Run the Application
3.1 Using Maven
Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
3.2 Directly from an IDE
Alternatively, you can run the application directly from your IDE (e.g., IntelliJ, Eclipse):

Import the project as a Maven project.
Run the ExpenseManagementApplication class, which contains the main method.
4. Access the API
Once the application is running, you can access the API at http://localhost:8080/expenses. Use tools like Postman or a web browser to interact with the API.

5. Lombok Setup
If you are using an IDE, ensure that the Lombok plugin is installed and enabled:

IntelliJ IDEA: Go to File -> Settings -> Plugins -> Lombok and install the plugin.
Eclipse: Go to Help -> Eclipse Marketplace -> Search for Lombok and install the plugin.
6. Testing the Application
You can test the API endpoints using tools like Postman or curl.

Example:

bash
Copy code
curl -X GET http://localhost:8080/expenses
7. Additional Configurations
Application Port: If you need to change the port, update the server.port property in application.properties.
properties
Copy code
server.port=8081
JPA Configuration: Customize your JPA settings in the application.properties file if needed.
