<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Button Clicker</title>
</head>
<body>
<form action="Contador">
		<input type="submit" value="ClickMe">
	</form>
	<p>Haz clickeado <%= session.getAttribute("button") %> veces</p>

</body>
</html>