<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Shopping Cart</title>
</head>
<body>
<h2>Welcome to shopping cart</h2>

${message} <br>

<a href="login"> login here </a>
<a href="Registration">Register here </a>
<hr color="blue">

<jsp:include page="Registration.jsp"></jsp:include>
<jsp:include page="login.jsp"></jsp:include>

</body>
</html>