# Modular Library Management System

## Problem Statement

Managing books in small libraries manually is inefficient and error-prone. This project provides a simple Java-based system to manage books, track issued status, and handle user interactions through a menu-driven interface. It demonstrates object-oriented design and modular architecture.

---

## Target User

Small libraries, students, and academic institutions.

---

## Core Features

* Add new books
* View all books
* Issue books
* Return books
* Menu-driven console UI
* File persistence (data saved in books.txt)
* Exception handling for invalid input

---

## OOP Concepts Used

### Abstraction

Service layer handles business logic separately.

### Encapsulation

Book and Member classes use private variables with getters/setters.

### Inheritance

(Not heavily used but structure allows extension)

### Polymorphism

Method behavior varies based on object state (issued/not issued).

### Exception Handling

Handles invalid user input safely.

### Collections

Uses ArrayList to store books dynamically.

---

## Architecture

UI Layer → ConsoleUI (handles user interaction)
Service Layer → LibraryService (business logic)
Model Layer → Book, Member, BorrowRecord

---

## How to Run

```bash
cd src
javac model/*.java service/*.java ui/*.java Main.java
java Main
```

---

## File Storage

Books are stored in a text file (`books.txt`) using FileWriter and loaded using BufferedReader.

---

## Project Structure

```
src/
 ├── Main.java
 ├── model/
 ├── service/
 ├── repository/
 └── ui/
```

---

## Conclusion

This project demonstrates clean object-oriented design with modular structure, basic persistence, and user interaction, making it scalable and maintainable.

---

## Future Scope

* GUI version (Java Swing)
* Database integration
* User authentication
* Fine calculation system
