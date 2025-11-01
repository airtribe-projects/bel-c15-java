# Spring Server

A basic REST API server built with pure Spring Framework (not Spring Boot) and embedded Tomcat.

## Features

- RESTful API for user management
- Pure Spring Framework (no Spring Boot)
- Embedded Tomcat server
- JSON request/response handling
- In-memory data storage
- Comprehensive API endpoints
- Unit tests included

## Project Structure

```
src/
├── main/
│   └── java/
│       └── org/
│           └── example/
│               ├── Main.java                    # Entry point with embedded Tomcat
│               ├── config/
│               │   ├── WebConfig.java           # Spring MVC configuration
│               │   └── WebAppInitializer.java   # Web application initializer
│               ├── controller/
│               │   └── UserController.java      # REST API endpoints
│               ├── model/
│               │   └── User.java                # User entity
│               └── service/
│                   └── UserService.java         # Business logic
└── test/
    └── java/
        └── org/
            └── example/
                └── controller/
                    └── UserControllerTest.java   # Unit tests
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Gradle

### Running the Server

1. Clone or download the project
2. Navigate to the project directory
3. Run the following command:

```bash
./gradlew run
```

Or compile and run manually:

```bash
./gradlew build
java -cp build/libs/SpringServer-1.0-SNAPSHOT.jar org.example.Main
```

The server will start on `http://localhost:8080`

### Running Tests

```bash
./gradlew test
```

## API Endpoints

### Health Check
- **GET** `/api/health` - Check server status

### Welcome
- **GET** `/api/welcome` - Welcome message with API info

### Users API
- **GET** `/api/users` - Get all users
- **GET** `/api/users/{id}` - Get user by ID
- **POST** `/api/users` - Create a new user
- **PUT** `/api/users/{id}` - Update an existing user
- **DELETE** `/api/users/{id}` - Delete a user
- **GET** `/api/users/search?name={name}` - Search users by name

## Example API Usage

### Get All Users
```bash
curl -X GET http://localhost:8080/api/users
```

### Create a New User
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Alice Johnson",
    "email": "alice@example.com",
    "age": 28
  }'
```

### Get User by ID
```bash
curl -X GET http://localhost:8080/api/users/1
```

### Update User
```bash
curl -X PUT http://localhost:8080/api/users/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Alice Smith",
    "email": "alice.smith@example.com",
    "age": 29
  }'
```

### Delete User
```bash
curl -X DELETE http://localhost:8080/api/users/1
```

### Search Users
```bash
curl -X GET "http://localhost:8080/api/users/search?name=john"
```

## Sample Data

The server comes with pre-loaded sample users:
1. John Doe (john.doe@example.com, age 25)
2. Jane Smith (jane.smith@example.com, age 30)
3. Bob Johnson (bob.johnson@example.com, age 35)

## Technology Stack

- **Spring Framework 6.0.13** - Core framework
- **Spring MVC** - Web layer
- **Jackson** - JSON processing
- **Embedded Tomcat 10.1.15** - Web server
- **Gradle** - Build tool
- **JUnit 5** - Testing framework

## Key Features

1. **Pure Spring**: Uses Spring Framework without Spring Boot for learning purposes
2. **Embedded Server**: No need for external Tomcat installation
3. **RESTful Design**: Follows REST principles for API design
4. **JSON Support**: Automatic JSON serialization/deserialization
5. **Error Handling**: Proper HTTP status codes and error responses
6. **Constructor Injection**: Uses modern Spring best practices
7. **Unit Tests**: Comprehensive test coverage

## Configuration

The server is configured through Java-based configuration:
- `WebConfig.java`: Configures Spring MVC and message converters
- `WebAppInitializer.java`: Initializes the web application context
- `Main.java`: Sets up and starts the embedded Tomcat server

## Development Notes

This project demonstrates:
- Setting up Spring MVC without Spring Boot
- Configuring embedded Tomcat programmatically
- Using Java-based Spring configuration
- Implementing RESTful APIs with proper HTTP methods
- Unit testing Spring controllers
- JSON request/response handling