<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Add Book</h2>
	
	<form action="SaveBook">
		<pre>
			Id 	    <input type="text" name="id"><br>
			Subject	<input type="text" name="subject"><br>
			Name	<input type="text" name="name"><br>
			Price	<input type="text" name="price">
			
			
			<input type="submit" name="Submit">
		</pre>
			
	</form>
</body>
</html>