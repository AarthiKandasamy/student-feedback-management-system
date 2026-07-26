package com.feedback.servlet;


import java.io.IOException;

import java.util.List;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;


import com.feedback.dao.FeedbackDAO;

import com.feedback.entity.Feedback;


@WebServlet("/view-feedback")

public class ViewFeedbackServlet
        extends HttpServlet {


    @Override

    protected void doGet(

            HttpServletRequest request,

            HttpServletResponse response)

            throws ServletException, IOException {


        /*
         * Get existing admin session
         */

        HttpSession session =

                request.getSession(false);


        /*
         * Check admin login
         */

        if (

            session == null ||

            session.getAttribute(
                    "admin"
            ) == null

        ) {


            response.sendRedirect(

                    "admin-login.jsp"

            );


            return;

        }


        /*
         * Get course from search box
         */

        String course =

                request.getParameter(
                        "course"
                );


        /*
         * Create DAO object
         */

        FeedbackDAO dao =

                new FeedbackDAO();


        List<Feedback> feedbackList;


        /*
         * If search box is empty,
         * show all feedback
         */

        if (

            course == null ||

            course.trim().isEmpty()

        ) {


            feedbackList =

                    dao.getAllFeedback();


        }


        /*
         * If admin searches a course,
         * show only that course
         */

        else {


            feedbackList =

                    dao.getFeedbackByCourse(
                            course
                    );

        }


        /*
         * Send filtered list to JSP
         */

        request.setAttribute(

                "feedbackList",

                feedbackList

        );


        /*
         * Open admin dashboard
         */

        request.getRequestDispatcher(

                "admin-dashboard.jsp"

        ).forward(

                request,

                response

        );

    }

}