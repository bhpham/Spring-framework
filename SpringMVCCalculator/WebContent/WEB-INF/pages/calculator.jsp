<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error {
	color: #ff0000;
}
 
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator page</title>
</head>
<body>
	
	<form:form action="/SpringMVCCalculator/operation" commandName="calculator" method="post">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Number 1</td>
				<td><form:input path="num1"/></td>
				<td><form:errors path="num1" cssClass="error" /></td>
			</tr>
			
			<tr>	
				<td>Number 2</td>
				<td><form:input path="num2"/></td>
				<td><form:errors path="num2" cssClass="error" /></td>
			</tr>
				
			<tr>
				<td>Add</td>
				<td><form:radiobutton path="op" value="add"/></td>
				<td><form:errors path="op" cssClass="error" /></td>
			</tr>	
			<tr>
				<td>Subtract</td>
				<td><form:radiobutton path="op" value="subtract"/></td>
				<td><form:errors path="op" cssClass="error" /></td>
			</tr>	
			
			<tr>
				<td>Multiply</td>
				<td><form:radiobutton path="op" value="multiply"/></td>
				<td><form:errors path="op" cssClass="error" /></td>
			</tr>	
			
			<tr>
				<td>Divide</td>
				<td><form:radiobutton path="op" value="divide"/></td>
				<td><form:errors path="op" cssClass="error" /></td>
			</tr>		
			<tr>
				<td><input type="submit" name="submit" value="Calculate"/></td>
			</tr>
		</table>
	</form:form>

</body>
</html>