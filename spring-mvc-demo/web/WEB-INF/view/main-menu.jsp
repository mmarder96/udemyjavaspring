<!DOCTYPE html>
<html>

<head>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/test.css">

    <script src="${pageContext.request.contextPath}/resources/js/test.js"></script>

</head>

<body>

<h2>Spring MVC Demo - Home Page</h2>

<ul id="links">
    <li><a href="hello/showForm">Hello World form</a></li>
    <li><a href="student/showForm">Student form</a></li>
    <li><a href="customer/showForm">Customer form</a></li>

</ul>

<br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>

</body>

</html>