<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

    <form:form action="processform" modelAttribute="student">

        <!-- calls student.setFirstName() -->
        First name: <form:input path="firstName" />
        <br>
        <!-- calls student.setLastName() -->
        Last name: <form:input path="lastName" />
        <br>
        <input type="submit" value="Submit" />

    </form:form>

</body>

</html>
