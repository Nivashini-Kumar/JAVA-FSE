# Spring REST Hands-on Project

A Spring Boot REST API project demonstrating the fundamentals of RESTful web services and authentication using the Spring Framework.

## Project Overview

This project implements a set of REST endpoints covering core Spring Boot concepts, including:

* REST API development with Spring Boot
* GET request handling
* Service and DAO layers
* XML-based data configuration
* REST resource design
* Basic Authentication
* JWT token generation
* Layered application architecture

## Project Structure

```
Spring REST Hands-on Project/
│
├── README.md
└── spring-learn/
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   └── resources/
    │   └── test/
    └── .mvn/
```

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Security
* Maven
* JWT (JSON Web Token)

## REST Endpoints

| Endpoint            | Description                                           |
| ------------------- | ----------------------------------------------------- |
| `/hello`            | Returns a Hello World response                        |
| `/country`          | Returns the default country                           |
| `/countries/{code}` | Retrieves country details by country code             |
| `/employees`        | Returns the list of employees                         |
| `/departments`      | Returns the list of departments                       |
| `/authenticate`     | Generates a JWT token after successful authentication |

## Features

* RESTful API implementation
* Layered architecture (Controller → Service → DAO)
* XML-based data loading
* Employee and Department services
* Spring Security configuration
* JWT authentication support
* Maven project structure

## Build

```bash
mvn clean install
```

## Run

```bash
mvn spring-boot:run
```

The application starts on:

```
http://localhost:8080
```

## Sample Requests

```
GET /hello

GET /country

GET /countries/IN

GET /employees

GET /departments

GET /authenticate
```

## Project Status

Completed implementation of Spring REST fundamentals, REST services, layered architecture, and JWT-based authentication using Spring Boot.
