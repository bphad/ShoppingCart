<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sv"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Registration</title>
</head>
<body>

	<h1>Vendor Registration Using Form Processing</h1><hr>
	
		<sv:form action="${pageContext.request.contextPath}/Register" method="post" commandName="vendor">
			Enter Vendor Name : <sv:input type="text" name="name" path="name"/><sv:errors path="name"/> <br><br>
			Enter Vendor City : <sv:input type="text" name="city" path="city"/><sv:errors path="city"/><br><br>
			Enter Vendor Email : <sv:input type="text" name="email" path="email"/><sv:errors path="email"/><br><br>
			Enter Vendor Password : <sv:input type="password" name="password" path="password"/><sv:errors path="password"/><br><br>
			Enter Vendor Re-Password : <input type="password" name="re-password"/><br><br>
			<input type="submit" value="Submit"/>
		</sv:form>

</body>
</html>