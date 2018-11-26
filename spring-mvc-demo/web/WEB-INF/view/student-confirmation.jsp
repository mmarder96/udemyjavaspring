<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

!DOCTYPE html>

<html>

<head>
    <title>Student Confirmation</title>
</head>

<body>

<!-- calls student.getFirstName() and student.getLastName() -->
The student is confirmed: ${student.firstName} ${student.lastName}

<br>

<!-- calls student.getCountry() -->
Country: ${student.country}

<br>

<!-- calls student.getFavoriteLanguage() -->
Favorite Language: ${student.favoriteLanguage}

<br>

<!-- calls student.getFavoriteLanguage() -->
Favorite Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.favoriteOperatingSystems}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>

</html>