# Student Feedback Management System

A web-based Student Feedback Management System developed using Java Servlets, JSP, Hibernate ORM, MySQL, HTML, CSS, and JavaScript.

## Features

- Student registration
- Student login
- Submit course feedback
- Feedback submission success page
- Admin login
- View student feedback
- Delete feedback

## Technologies Used

- Java
- JSP
- Servlets
- Hibernate ORM
- MySQL
- HTML
- CSS
- JavaScript
- Apache Tomcat
- Eclipse IDE

## Project Structure

```text
StudentFeedbackManagementSystem
│
├── Java Resources
│   └── src
│       ├── hibernate.cfg.xml
│       │
│       └── com.feedback
│           ├── entity
│           │   ├── Student.java
│           │   ├── Feedback.java
│           │   └── Admin.java
│           │
│           ├── dao
│           │   ├── StudentDAO.java
│           │   ├── FeedbackDAO.java
│           │   └── AdminDAO.java
│           │
│           ├── servlet
│           │   ├── StudentRegisterServlet.java
│           │   ├── StudentLoginServlet.java
│           │   ├── FeedbackServlet.java
│           │   ├── AdminLoginServlet.java
│           │   ├── ViewFeedbackServlet.java
│           │   └── DeleteFeedbackServlet.java
│           │
│           └── util
│               └── HibernateUtil.java
│
├── WebContent
│   ├── index.jsp
│   ├── student-register.jsp
│   ├── student-login.jsp
│   ├── feedback.jsp
│   ├── feedback-success.jsp
│   ├── admin-login.jsp
│   ├── admin-dashboard.jsp
│   │
│   ├── css
│   │   └── style.css
│   │
│   ├── js
│   │   └── validation.js
│   │
│   └── WEB-INF
│
└── README.md
