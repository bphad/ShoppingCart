<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1>Home Page</h1><hr>
	Name : <c:out value="${name }"/><br><br>
	Department : <c:out value="${dept }"/><br><hr>
	
	<a href="${pageContext.request.contextPath }/Show-Products">Show-Products</a> |
	<a href="${pageContext.request.contextPath }/Vendor-Registration">Vendor-Registration</a> |
	<a href="${pageContext.request.contextPath }/Add-Product">Add-Product</a> |
	<a href="${pageContext.request.contextPath }/Admin-Login">Admin-Login</a> 	
</body>
</html>