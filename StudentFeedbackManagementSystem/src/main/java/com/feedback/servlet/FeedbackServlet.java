package com.feedback.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.feedback.dao.FeedbackDAO;
import com.feedback.entity.Feedback;
import com.feedback.entity.Student;

@WebServlet("/submit-feedback")
public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String courseName =
                request.getParameter("courseName");

        int teachingRating =
                Integer.parseInt(
                        request.getParameter(
                                "teachingRating"
                        )
                );

        int contentRating =
                Integer.parseInt(
                        request.getParameter(
                                "contentRating"
                        )
                );

        int infrastructureRating =
                Integer.parseInt(
                        request.getParameter(
                                "infrastructureRating"
                        )
                );

        String comments =
                request.getParameter("comments");


        // Get logged-in student
        HttpSession session =
                request.getSession();

        Student student =
                (Student) session.getAttribute(
                        "student"
                );


        // Create Feedback object
        Feedback feedback =
                new Feedback();


        feedback.setCourseName(
                courseName
        );

        feedback.setTeachingRating(
                teachingRating
        );

        feedback.setContentRating(
                contentRating
        );

        feedback.setInfrastructureRating(
                infrastructureRating
        );

        feedback.setComments(
                comments
        );

        feedback.setStudent(
                student
        );


        // Automatically set today's date
        feedback.setFeedbackDate(
                LocalDate.now()
        );


        // Save feedback
        FeedbackDAO dao =
                new FeedbackDAO();

        dao.saveFeedback(
                feedback
        );


        // Redirect to success page
        response.sendRedirect(
                "feedback-success.jsp"
        );
    }
}