<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Operation page</title>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<h1>All recored operations</h1>
	<form action="/SpringMVCCalculator/operation" method="post">
	<table boader="1">
		<tr>
			<th>Number 1</th>
			<th>Number 2</th>
			<th>Operation</th>
			<th>Result</th>
		</tr>
		<c:forEach items="${ calcResultList }" var="calculator">
			
		<tr>
			<td> ${calculator.num1}</td>
			<td> ${calculator.num2}</td>
			<td> ${calculator.op}</td>
			<td> ${calculator.result}</td>	
		</tr>
		</c:forEach>
	</table>
		
			
		<a href="${contextPath}/calculator">Back to Calculator</a>
	</form>
	
</body>
</html>