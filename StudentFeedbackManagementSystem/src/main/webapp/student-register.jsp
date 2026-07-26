<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Student Registration</title>

    <link rel="stylesheet"
          href="student-registration.css">

    <script src="validation.js">
    </script>

</head>

<body>

    <div class="form-container">

        <h2>
            Student Registration
        </h2>

        <form action="register"
              method="post"
              onsubmit="return validateRegistration()">

            <label>
                Name
            </label>

            <input type="text"
                   id="name"
                   name="name"
                   placeholder="Enter Name"
                   required>


            <label>
                Email
            </label>

            <input type="email"
                   id="email"
                   name="email"
                   placeholder="Enter Email"
                   required>


            <label>
                Password
            </label>

            <input type="password"
                   id="password"
                   name="password"
                   placeholder="Enter Password"
                   required>


            <label>
                Department
            </label>

            <input type="text"
                   name="department"
                   placeholder="Enter Department"
                   required>


            <label>
                Year
            </label>

            <select name="year"
                    required>

                <option value="">
                    Select Year
                </option>

                <option value="1">
                    First Year
                </option>

                <option value="2">
                    Second Year
                </option>

                <option value="3">
                    Third Year
                </option>

                <option value="4">
                    Fourth Year
                </option>

            </select>


            <button type="submit">

                Register

            </button>

        </form>

        <p>

            Already registered?

            <a href="student-login.jsp">

                Login

            </a>

        </p>

        <br>

        <a href="index.jsp">

            Back to Home

        </a>

    </div>

</body>

</html>