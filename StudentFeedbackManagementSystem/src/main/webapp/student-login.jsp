<!DOCTYPE html>
<html>

<head>

    <title>Student Login</title>

    <link rel="stylesheet"
          href="student-login.css">

</head>

<body>

    <div class="form-container">

        <h2>Student Login</h2>

        <form action="student-login"
              method="post">

            <input type="email"
                   name="email"
                   placeholder="Enter Email"
                   required>

            <input type="password"
                   name="password"
                   placeholder="Enter Password"
                   required>

            <button type="submit">
                Login
            </button>

        </form>

        <p>
            New student?
            <a href="student-register.jsp">
                Register
            </a>
        </p>

    </div>

</body>

</html>