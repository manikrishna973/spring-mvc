<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
Hello World of Spring
<br> <br>
Student Name: ${param.studentName}
<br> <br>
The Message: ${message}
<br>

<!--  use the JSP expression ${pageContext.request.contextPath} to access the correct root directory for your web application. -->
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" alt="spring-logo" />

</body>
</html>