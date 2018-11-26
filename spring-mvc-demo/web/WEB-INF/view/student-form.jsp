<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processform" modelAttribute="student">

    <!-- calls student.setFirstName() -->
    First name: <form:input path="firstName"/>
    <br>
    <!-- calls student.setLastName() -->
    Last name: <form:input path="lastName"/>
    <br>
    <!-- calls student.Country() -->
    Country:
    <form:select path="country">

        <!-- calls student.getCountryOptions to generate options from linkedHashMap -->
        <form:options items="${options}"/>

    </form:select>

    <input type="submit" value="Submit"/>

</form:form>

</body>

</html>
