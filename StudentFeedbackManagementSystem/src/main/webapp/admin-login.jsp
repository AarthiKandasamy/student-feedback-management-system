<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Admin Login</title>

    <link rel="stylesheet"
          href="admin-login.css">

</head>

<body>

    <div class="form-container">

        <h2>Admin Login</h2>

        <%
            String error =
                request.getParameter("error");

            if ("invalid".equals(error)) {
        %>

            <p style="color:red;">
                Invalid username or password
            </p>

        <%
            }
        %>

        <form action="admin-login"
              method="post">

            <input type="text"
                   name="username"
                   placeholder="Enter Username"
                   required>

            <input type="password"
                   name="password"
                   placeholder="Enter Password"
                   required>

            <button type="submit">
                Login
            </button>

        </form>

        <br>

        <a href="index.jsp">
            Back to Home
        </a>

    </div>

</body>

</html>