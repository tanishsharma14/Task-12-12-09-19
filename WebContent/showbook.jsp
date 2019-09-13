<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Book Record  :</h2>
	<pre>
		Id:${bookinfo.id}  
		Name:${bookinfo.name}
		Subject:${bookinfo.subject}
		Price:${bookinfo.price}
	</pre>
	
	<a href="addbook.jsp">Add Book</a><br>
	<a href="deletebook.jsp">Delete book</a>
</body>
</html>