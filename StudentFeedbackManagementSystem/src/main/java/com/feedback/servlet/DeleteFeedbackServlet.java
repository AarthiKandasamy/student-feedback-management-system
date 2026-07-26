package com.feedback.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.feedback.dao.FeedbackDAO;

@WebServlet("/delete-feedback")
public class DeleteFeedbackServlet
        extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String idString =
                request.getParameter("id");

        int id =
                Integer.parseInt(idString);

        FeedbackDAO dao =
                new FeedbackDAO();

        dao.deleteFeedback(id);

        response.sendRedirect(
                "view-feedback"
        );
    }
}