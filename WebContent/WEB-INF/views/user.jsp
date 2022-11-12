<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<h2>User Info</h2>

	<form:form action="user.html" method="post">
		<form:input path="firstName"/><br/>
		<form:input path="lastName"/><br/>
		<form:input path="email"/><br/>
		<input type="submit" value="Create"/>
	</form:form>

<%-- 	<form action="user.html" method="post">
		<input type="text" name="firstName"/><br/>
		<input type="text" name="lastName"/><br/>
		<input type="text" name="email"/><br/>
		<input type="submit" value="Create"/>
	</form> --%>

</body>
</html>