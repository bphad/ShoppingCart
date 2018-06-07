<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Description</title>
</head>
<body>
	
	<h1>Product Description</h1><hr>
		<c:forEach var="v" items="${list }">
		<c:if test="${id == v.getId() }">
			<h2><c:out value="${v.getName()}"/></h2>
		 Price :<c:out value="${v.getPrice()}"/><br>
   Description :<c:out value="${v.getDesc()}"/>		
		</c:if>
		</c:forEach>

</body>
</html>