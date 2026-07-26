package com.feedback.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.feedback.dao.StudentDAO;
import com.feedback.entity.Student;

@WebServlet("/register")
public class StudentRegisterServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name =
                request.getParameter("name");

        String email =
                request.getParameter("email");

        String password =
                request.getParameter("password");

        String department =
                request.getParameter("department");

        int year =
                Integer.parseInt(
                        request.getParameter("year"));

        Student student =
                new Student(
                        name,
                        email,
                        password,
                        department,
                        year);

        StudentDAO dao =
                new StudentDAO();

        dao.registerStudent(student);

        response.sendRedirect(
                "student-login.jsp");
    }
}