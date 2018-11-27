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

    First name: <form:input path="firstName"/>

    <br>

    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br>

    Free passes (*): <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>

    <br>

    Postal code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>

    <br>

    <input type="submit" value="Submit"/>

</form:form>

</body>


</html>