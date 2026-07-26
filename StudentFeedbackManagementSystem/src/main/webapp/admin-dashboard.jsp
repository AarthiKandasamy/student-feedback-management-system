<%@ page import="java.util.List" %>
<%@ page import="com.feedback.entity.Feedback" %>
<%@ page import="com.feedback.entity.Admin" %>

<%

    Admin admin =
            (Admin) session.getAttribute("admin");


    if (admin == null) {

        response.sendRedirect(
                "admin-login.jsp"
        );

        return;
    }


    List<Feedback> feedbackList =
            (List<Feedback>)
            request.getAttribute(
                    "feedbackList"
            );

%>


<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>
        Admin Dashboard
    </title>

    <link rel="stylesheet"
          href="admin.css">

</head>


<body>


<div class="dashboard-container">


    <h1>
        Admin Dashboard
    </h1>


    <p>

        Welcome,

        <b>
            <%= admin.getUsername() %>
        </b>

    </p>


    <hr>


    <h2>
        Student Feedback
    </h2>


    <!-- COURSE SEARCH -->

    <form action="view-feedback"
          method="get">


        <input type="text"

               name="course"

               placeholder="Search by course"

               value="<%= request.getParameter("course") != null
                       ? request.getParameter("course")
                       : "" %>">


        <button type="submit">

            Search

        </button>


        <a href="view-feedback">

            Clear

        </a>


    </form>


    <br>


    <%

        if (feedbackList == null ||
            feedbackList.isEmpty()) {

    %>


        <p>

            No feedback available.

        </p>


    <%

        } else {

    %>


    <table>


        <tr>

            <th>
                ID
            </th>

            <th>
                Student Name
            </th>

            <th>
                Email
            </th>

            <th>
                Course
            </th>

            <th>
                Teaching Rating
            </th>

            <th>
                Content Rating
            </th>

            <th>
                Infrastructure Rating
            </th>

            <th>
                Comments
            </th>

            <th>
                Date
            </th>

            <th>
                Action
            </th>

        </tr>


        <%

            for (Feedback feedback :
                 feedbackList) {

        %>


        <tr>


            <td>

                <%= feedback.getId() %>

            </td>


            <td>

                <%= feedback
                    .getStudent()
                    .getName() %>

            </td>


            <td>

                <%= feedback
                    .getStudent()
                    .getEmail() %>

            </td>


            <td>

                <%= feedback
                    .getCourseName() %>

            </td>


            <td>

                <%= feedback
                    .getTeachingRating() %>

            </td>


            <td>

                <%= feedback
                    .getContentRating() %>

            </td>


            <td>

                <%= feedback
                    .getInfrastructureRating() %>

            </td>


            <td>

                <%= feedback
                    .getComments() %>

            </td>


            <td>

                <%= feedback
                    .getFeedbackDate() %>

            </td>


            <td>


                <a href="delete-feedback?id=<%= feedback.getId() %>"

                   onclick="return confirm(
                       'Are you sure you want to delete this feedback?'
                   );">


                    Delete


                </a>


            </td>


        </tr>


        <%

            }

        %>


    </table>


    <%

        }

    %>


    <br>


    <a href="index.jsp">

        Home

    </a>


</div>


</body>

</html>