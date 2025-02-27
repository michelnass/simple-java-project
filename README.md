# BMI Calculator Web Application

A simple Java-based web application for calculating Body Mass Index (BMI) with database integration for storing calculation history.

## Features

- Calculate BMI using metric units (kg, meters) or imperial units (pounds, inches)
- View BMI category (Underweight, Normal weight, Overweight, Obese)
- Save calculation history to database
- View calculation history in chronological order

## Technologies Used

- Java 11
- Spring Boot 2.7.x
- Spring Data JPA
- H2 Database
- Thymeleaf for HTML templates
- Maven for dependency management

## How to Run

1. Ensure you have Java 11+ and Maven installed
2. Clone this repository
3. Build with Maven:
   ```
   mvn clean package
   ```
4. Run the application:
   ```
   java -jar target/simple-java-project-1.0-SNAPSHOT.jar
   ```
5. Access the application at http://localhost:8080
6. Access the H2 database console at http://localhost:8080/h2-console (using the credentials in application.properties)

## Database

- The application uses H2 in-memory database by default
- Configuration can be found in `src/main/resources/application.properties`
- Database console available at http://localhost:8080/h2-console
  - JDBC URL: jdbc:h2:file:./bmi-history-db
  - Username: sa
  - Password: password

## Screenshots

(Screenshots would be added here)

## License

This project is open source.
