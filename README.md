
# To-Do List Application

A simple **To-Do List** application built with **Spring Boot** and **PostgreSQL** to manage daily tasks. It allows you to perform basic CRUD operations on tasks, including adding, editing, deleting, and marking tasks as complete. The application provides a JSON API to interact with tasks.

## Features

- **Create**: Add a new task to the list.
- **Read**: View the details of a specific task or all tasks.
- **Update**: Edit an existing task.
- **Delete**: Remove a task from the list.

## Technologies Used

- **Spring Boot**: Backend framework for building the application.
- **PostgreSQL**: Database for storing tasks.
- **Spring Data JPA**: For handling CRUD operations with the database.
- **Spring Web**: For creating REST APIs.
- **Thymeleaf**: Optional (if you need any views, though this project focuses on the API).
- **Maven**: Build tool for managing dependencies.

## Getting Started

### Prerequisites

- **Java 21** (Make sure Java is installed and properly set up on your machine).
- **PostgreSQL**: Ensure PostgreSQL is installed and running.
- **Maven**: Make sure Maven is installed for building the project.

### Setting Up the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/dilshod1405/ToDO-List.git
   ```

2. Navigate to the project directory:

   ```bash
   cd ToDO-List
   ```

3. Configure the database:

   - Create a PostgreSQL database for the application.
   - Update the `application.properties` file with your PostgreSQL connection details:

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```

4. Build the project using Maven:

   ```bash
   mvn clean install
   ```

5. Run the application:

   ```bash
   mvn spring-boot:run
   ```

   The application will be available at `http://localhost:8081`.

## Endpoints

### **GET /tasks**
Fetch all tasks.

**Response:**
```json
[
    {
        "id": 1,
        "title": "Task 1",
        "description": "Task 1 description",
        "completed": false
    },
    {
        "id": 2,
        "title": "Task 2",
        "description": "Task 2 description",
        "completed": true
    }
]
```

### **POST /tasks**
Create a new task.

**Request Body:**
```json
{
    "title": "New Task",
    "description": "Task description",
    "completed": false
}
```

**Response:**
```json
{
    "id": 3,
    "title": "New Task",
    "description": "Task description",
    "completed": false
}
```

### **PUT /tasks/{id}**
Update a task by ID.

**Request Body:**
```json
{
    "title": "Updated Task",
    "description": "Updated task description",
    "completed": true
}
```

**Response:**
```json
{
    "id": 1,
    "title": "Updated Task",
    "description": "Updated task description",
    "completed": true
}
```

### **DELETE /tasks/{id}**
Delete a task by ID.

**Response:**
```json
{
    "message": "Task deleted successfully"
}
```
