# DevSecOps HTTP Application

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://shields.io/)

## Project Overview
This is a full-stack web application built for demonstrating DevSecOps practices. The application consists of a React frontend and a Spring Boot backend that provides a simple data retrieval service.

## Technology Stack

### Frontend
- React.js - A JavaScript library for building user interfaces
- Created with Create React App
- Runs on port 3000 by default

### Backend
- Java 17
- Spring Boot 3.1.5
- Spring Security
- Maven for dependency management
- JavaFaker for generating mock data
- Lombok for reducing boilerplate code

## Project Structure

### Frontend
The frontend is a React application that displays posts retrieved from the backend API.

### Backend
The backend is a Spring Boot application that provides REST endpoints:
- `/` - Returns basic application information
- `/posts` - Returns a list of generated posts (accepts a `count` parameter)

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Node.js and npm
- Maven

### Backend Setup
1. Navigate to the backend directory:
   ```
   cd backend
   ```
2. Build the application:
   ```
   mvn clean install
   ```
3. Run the application:
   ```
   mvn spring-boot:run
   ```
   The backend will run on port 8080 by default.

### Frontend Setup
1. Navigate to the frontend directory:
   ```
   cd frontend
   ```
2. Install dependencies:
   ```
   npm install
   ```
3. Start the development server:
   ```
   npm start
   ```
4. The React app will run on port 3000 by default.

## Usage
Once both the frontend and backend are running, you can access the application at http://localhost:3000. The frontend will communicate with the backend to retrieve and display posts.

## Security Features

- **Spring Security**: The Spring Boot app uses Spring Security to protect the application.
- **HTTP Headers**: Security-related HTTP headers are configured to protect against common web vulnerabilities.

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.

---

## <h3 align="center"> &copy; IBM Corporation 2025. All rights reserved. <h3/>