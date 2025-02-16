# Spring-Security-Practice

This project implements JWT authentication using Spring Security, supporting both Basic and Form Authentication. It demonstrates stateless session management through JWT, with role-based access control to secure resources.

Key features include:

JWT Authentication: Validates tokens to ensure secure access.
Role-Based Access Control: Restricts access based on user roles.
Basic and Form Authentication: Provides flexibility in user login options.
Secure Password Storage: Utilizes BCrypt encryption to securely hash and store user passwords.
Stateless Session Management: Uses JWT tokens for authentication, ensuring a stateless session for scalability.
The project includes:

AuthTokenFilter: Handles token validation for incoming requests.
AuthEntryPointJwt: Manages unauthorized access responses.
Login Endpoint: Issues JWT tokens upon successful user authentication.
This setup ensures both secure authentication and efficient session management.
