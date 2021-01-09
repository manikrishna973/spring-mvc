<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- parent student/ relative path processForm -->
	<!-- when the page is loaded  spring will call the modelAttribute getters and when its submitted it will call the setters  -->
	<form:form action="processForm" modelAttribute="student" method="get">
		<div>
			<!-- path value is the java object property field  -->
			<form:input path="fname" placeholder="first name" />
		</div>
		<br>
		<br>
		<div>
			<form:input path="lname" placeholder="last name" />
		</div>
		<br>
		<br>

		<div>
			<form:select path="country">

				<!-- 'value' will be sent to backend, 'label' is to display on UI -->
				<%-- <form:option value="America" label="America"></form:option>
				<form:option value="Italy" label="Italy"></form:option>
				<form:option value="India" label="India"></form:option>
				<form:option value="japan" label="Japan"></form:option> --%>


				<!-- Load countries from java class -->
				<!-- items refer to collection of elements/data -->
				<form:options items="${student.countryOptions}" />

			</form:select>
			<br> <br>
		</div>
		<br>
		<br>
		<div>
			<!-- Radio Buttons-->
			<!-- path which calls setters when submitted getters when loaded -->
			Favorite Language:
			<form:radiobutton path="favoriteProgrammingLanguage" value="java"
				label="java" />
			<form:radiobutton path="favoriteProgrammingLanguage" value="react"
				label="react" />
			<form:radiobutton path="favoriteProgrammingLanguage"
				value="javaScript" label="javaScript" />
		</div>

		<br>
		<br>

		<div>
			<!-- Check Boxes can be selected multiple options -->
			Operating Systems:
			<form:checkbox path="operatingSystems" value="Linux" label="Linux" />

			<form:checkbox path="operatingSystems" value="Mac OS" label="Mac OS" />

			<form:checkbox path="operatingSystems" value="MS Windows" label="MS windows" />

		</div>

		<input type="submit">
	</form:form>
</body>
</html>