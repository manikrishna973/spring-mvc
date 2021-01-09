<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-confirmation</title>
</head>
<body>
	<br>
	<br> The student is confirmed: ${student.fname} ${student.lname}
	<br>
	<br> country: ${student.country}
	<br>
	<br> Favorite Language: ${student.favoriteProgrammingLanguage}
	<br>
	<br> Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>