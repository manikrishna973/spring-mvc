<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="processForm" method="get" modelAttribute="customer">

First Name:
<form:input path="firstName" />
		<br>
		<br>
Last Name(*):
<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		
		Points:<form:input path="points" />
		<form:errors path="points" cssClass="error" />
		<br>
		<br>
        
        postal code:<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>
		
		 Course code:<form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		<br>
		<br>
		
		<i>(*) Asterisk Means Required</i>
		<input type="submit">
	</form:form>

</body>
</html>