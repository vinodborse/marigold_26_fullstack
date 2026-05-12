<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" isELIgnored = "false"%>

<html>
	<head>
		<title>My Web App</title>
	</head>
	<body>
		<h1> We are using JSP file...!!!</h1>
		

		<h1> ${stdName} </h1>
		
		<form action="search" method="GET">
		<label>Enter Your request:- </label>
		<input type="text" name="q">
		<input type="submit" value= "Search">
		</form>
		
		<h1>${data}</h1>
		
	</body>
</html>	