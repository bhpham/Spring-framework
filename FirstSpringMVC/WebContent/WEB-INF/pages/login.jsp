<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<form:form action="employee/dog" commandName="employee" method="post"> 
		Username: <form:input path="username"/> <br>
		<font color="red"><form:errors path="username"/></font>
		Password: <form:password path="password"/> <br>
		<font color="red"><form:errors path="password"/></font>
		Age: <form:age path="age"/> <br>
		
		<input type="submit" value="Click here to login"/>
		
	</form:form>

<%-- 	<form action="/FirstSpringMVC/dog" method="post"> --%>
<!-- 		Username: <input type="text" name="username"/> <br> -->
<!-- 		Password: <input type="password" name="password" /> <br> -->
<!-- 		Age: <input type="age" name="age" /> <br> -->
		
<!-- 		<input type="submit" value="Click here to login"/> -->
<%-- 	</form> --%>

</body>
</html>