<%@ page import="com.feedback.entity.Student" %>

<%

Student student =
    (Student) session.getAttribute("student");

if (student == null) {

    response.sendRedirect(
        "student-login.jsp");

    return;
}

%>

<!DOCTYPE html>
<html>

<head>

    <title>Submit Feedback</title>

    <link rel="stylesheet"
          href="feedback.css">

</head>

<body>

    <div class="form-container">

        <h2>
            Welcome <%= student.getName() %>
        </h2>

        <h3>
            Submit Feedback
        </h3>

        <form action="submit-feedback"
              method="post">

            <input type="text"
                   name="courseName"
                   placeholder="Course Name"
                   required>

            <label>
                Teaching Rating
            </label>

            <select name="teachingRating">

                <option value="1">1 - Poor</option>

                <option value="2">2 - Average</option>

                <option value="3">3 - Good</option>

                <option value="4">4 - Very Good</option>

                <option value="5">5 - Excellent</option>

            </select>

            <label>
                Content Rating
            </label>

            <select name="contentRating">

                <option value="1">1</option>

                <option value="2">2</option>

                <option value="3">3</option>

                <option value="4">4</option>

                <option value="5">5</option>

            </select>

            <label>
                Infrastructure Rating
            </label>

            <select name="infrastructureRating">

                <option value="1">1</option>

                <option value="2">2</option>

                <option value="3">3</option>

                <option value="4">4</option>

                <option value="5">5</option>

            </select>

            <textarea name="comments"
                      placeholder="Enter your comments"
                      rows="5">
            </textarea>

            <button type="submit">
                Submit Feedback
            </button>

        </form>

    </div>

</body>

</html>