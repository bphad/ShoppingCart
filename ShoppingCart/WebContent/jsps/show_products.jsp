<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
	
	<h1>Products</h1><hr>
		<c:forEach var="p" items="${list }">
			<h2><c:out value="${p.getName()}"/></h2>
			Price : <c:out value="${p.getPrice()}"/><br>
			<a href="${pageContext.request.contextPath}/Show-Description?id=<c:out value="${p.getId()}"/>">Show-Description</a>
		</c:forEach>
</body>
</html>