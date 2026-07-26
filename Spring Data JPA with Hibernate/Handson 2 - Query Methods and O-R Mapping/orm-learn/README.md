# Spring Data JPA with Hibernate - Handson 2

## Query Methods and O-R Mapping

This hands-on demonstrates Spring Data JPA query methods and Object Relational Mapping using Hibernate.

## Concepts Covered

- Spring Data JPA Repository
- Derived Query Methods
- Querying using method names
- Sorting query results
- Entity relationships
- Many-To-One Mapping

## Implementations

### Country Query Methods

Implemented queries:

- Find countries containing a given keyword
- Find countries containing keyword and sort by name
- Find countries starting with a specific character

### Many-To-One Mapping

Implemented relationship:

Employee → Department

An employee belongs to one department using JPA `@ManyToOne` mapping.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Result

All query methods and entity mappings were successfully tested using Spring Boot runner classes.
