# Skill Experiment 3: User Registration System with Validation

## Course
SOA Programming and Microservices

## Experiment Objective
To implement a user registration and login system with input validation,
unique constraints, database storage, and error handling using Spring Boot.

## Technologies Used
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API
- Jakarta Validation

## Features

### 1. User Registration
Endpoint:
POST /register

Registers a new user with:
- Username
- Email
- Password

### 2. User Login
Endpoint:
POST /login

Validates the username and password.

### 3. Validation
- Username cannot be empty
- Email cannot be empty
- Email must have valid format
- Password cannot be empty
- Username must be unique
- Email must be unique

### 4. Error Handling
The application handles:
- Duplicate username
- Duplicate email
- Invalid email
- Missing fields
- Invalid login credentials

## API Testing

### Register User

POST:
http://localhost:8083/register

Request:

{
    "username": "nandu",
    "email": "nandu@gmail.com",
    "password": "123456"
}

Response:

User registered successfully

### Login User

POST:
http://localhost:8083/login

Request:

{
    "username": "nandu",
    "password": "123456"
}

Response:

Login successful

## Test Scenarios

1. Valid registration
2. Duplicate registration
3. Invalid email
4. Missing fields
5. Valid login
6. Invalid login credentials

## Database

Database name:

user_registration_db

Table:

users

## Conclusion

The User Registration System successfully validates user input,
prevents duplicate users, stores user information in MySQL,
and provides registration and authentication APIs.