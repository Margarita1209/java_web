<%@ page language="java" contentType="text/html; charset=ISO-8859-8"
    pageEncoding="ISO-8859-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-8">
	<title>Boton Clicker</title>
</head>
<body>
	<form action="Contador">
		<input type="submit" value="ClickMe">
	</form>
	<p>Haz clickeado <%= session.getAttribute("button") %> veces</p>

</body>
</html>