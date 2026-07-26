package com.feedback.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.feedback.dao.StudentDAO;
import com.feedback.entity.Student;

@WebServlet("/student-login")
public class StudentLoginServlet
        extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String email =
                request.getParameter("email");

        String password =
                request.getParameter("password");

        StudentDAO dao =
                new StudentDAO();

        Student student =
                dao.login(email, password);

        if (student != null) {

            HttpSession session =
                    request.getSession();

            session.setAttribute(
                    "student",
                    student);

            response.sendRedirect(
                    "feedback.jsp");

        } else {

            response.sendRedirect(
                    "student-login.jsp?error=invalid");
        }
    }
}