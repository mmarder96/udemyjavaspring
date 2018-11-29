<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>
    <title>Customer Registration Form</title>

    <style>
        .error {color:red}
    </style>
</head>

<body>

<b>Fill out form. Asterisk (*) means required.</b>

<form:form action="processForm" modelAttribute="customer">

    <!-- calls customer.setFirstName() -->
    First Name: <form:input path="firstName"/>

    <br>

    <!-- calls customer.setLastName() -->
    Last Name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br>

    <!-- calls customer.setFreePasses() -->
    Free Passes (*): <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>

    <br>

    <!-- calls customer.setPostalCode() -->
    Postal Code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>

    <br>

    <!-- calls customer.setCourseCode() -->
    Course Code: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>

    <br>

    <input type="submit" value="Submit"/>

</form:form>

</body>


</html>