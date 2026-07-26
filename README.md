# Student Feedback Management System

## Overview

This is a web-based Student Feedback Management System developed to collect and manage student feedback efficiently.

Students can register, log in, and submit feedback about their courses. Administrators can log in to view and manage the submitted feedback.

## Features

### Student Module

- Student Registration
- Student Login
- Submit Course Feedback
- Rate Teaching Quality
- Rate Course Content
- Rate Infrastructure
- Add Comments
- Feedback Submission Success Page

### Admin Module

- Admin Login
- View Student Feedback
- View Student Details
- Delete Feedback Records

## Technologies Used

- Java
- JSP
- Servlets
- Hibernate ORM
- MySQL
- HTML
- CSS
- JavaScript
- Apache Tomcat 9
- Eclipse IDE

## Project Structure

- Entity Layer
- DAO Layer
- Servlet Layer
- Utility Layer
- JSP View Layer
- CSS and JavaScript

## Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE feedback_db;
Hibernate automatically creates and updates the required tables using:

<property name="hibernate.hbm2ddl.auto">
    update
</property>
How to Run
Import the project into Eclipse.
Configure Apache Tomcat 9.
Configure MySQL database details in hibernate.cfg.xml.
Create the feedback_db database.
Add the required Hibernate and MySQL Connector JAR files.
Run the project on Tomcat.

Open the application:

http://localhost:8080/StudentFeedbackManagementSystem/
Admin Login

Insert an admin account into the database:

INSERT INTO admin(username, password)
VALUES ('admin', 'admin123');
Screenshots
🏠 Home Page

Add your home page screenshot here.

📝 Student Registration

Add your student registration screenshot here.

🔐 Student Login

Add your student login screenshot here.

📋 Feedback Form

Add your feedback form screenshot here.

✅ Feedback Submitted Successfully

Add your feedback success page screenshot here.

👨‍💼 Admin Dashboard

Add your admin dashboard screenshot here.

Purpose

This project was developed as part of Java Full Stack training to gain hands-on experience with Java web application development, Servlets, JSP, Hibernate ORM, MySQL database integration, and MVC architecture.

Future Improvements
Password Encryption
Feedback Search and Filtering
Pagination
Dashboard Statistics
Feedback Charts and Reports
Spring Boot Migration
REST APIs
Spring Security
Author

Aarthi Kandasamy


This format matches your **Spring MVC project README style** and is suitable for your GitHub repository.
